/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.apache.commons.collections.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import br.com.senior.custom.session.SessionInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;		
import br.com.senior.furb.basico.Genero.Id;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.customspringdata.CustomOrder;
import br.com.senior.messaging.customspringdata.filter.FilterParser;
import br.com.senior.messaging.customspringdata.FilterParameters;
import br.com.senior.messaging.customspringdata.IntrospectorUtil;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@Service("furb.basico.GeneroCrudServiceImpl")
public class GeneroCrudServiceImpl implements GeneroCrudService {
	
	private static final Logger logger = LoggerFactory.getLogger(GeneroCrudServiceImpl.class);
	
	@Inject
	private GeneroBaseRepository repository;
	
	@Inject
	private FilterParser filterParser;
	
	@Inject
	private TranslationHubApi translationHubApi;

	@Inject
	private SessionInitializer sessionInitializer;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public GeneroBaseRepository getRepository() {
		return repository;
	}
	
	@Override
	@Transactional
	public GeneroEntity create(GeneroEntity entity) {
		prepareSession();
		try {
			return this.repository.saveAndFlush(entity);
		} catch (DataIntegrityViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, "Data integrity violation to Create GeneroEntity. Error: " + ex.getMessage());
		}
	}
	
	@Override
	@Transactional
	public GeneroEntity createGenero(GeneroEntity entity) {
		return create(entity);
	}
	
	@Override
	@Deprecated
	@Transactional
	public GeneroEntity createMergeGenero(GeneroEntity entity) {
		return create(entity);
	}
	
	@Override
	@Transactional
	public GeneroEntity updateGenero(GeneroEntity entity) {
		prepareSession();
		try {
			return repository.saveAndFlush(entity);
		} catch (DataIntegrityViolationException ex) {
		throw new ServiceException(ErrorCategory.CONFLICT, "Data integrity violation to Update GeneroEntity. Error: " + ex.getMessage());
		}
	}
	
	@Override
	@Deprecated
	@Transactional
	public GeneroEntity updateMergeGenero(GeneroEntity entity) {
		return updateGenero(entity);
	}
	
	@Override
	@Transactional
	public void deleteGenero(Id id) {
		prepareSession();
		try {
	    	repository.delete(java.util.UUID.fromString(id.id));
	    } catch  (EmptyResultDataAccessException ex) {
	    	throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getString("furb.basico.Genero_notFound", "Genero not found with id " + id.id));
	    } 
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public GeneroEntity retrieveGenero(Id id) {
		prepareSession();
		GeneroEntity entity = this.repository.findOne(java.util.UUID.fromString(id.id));
		if (entity == null) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getString("furb.basico.Genero_notFound", "Genero not found with id " + id.id));
		}
	    return entity;
	}
	
	@Override
	@Deprecated
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<GeneroEntity> listGenero(int skip, int top) {
		prepareSession();
		Page<GeneroEntity> requestedPage = this.listGeneroPageable(skip, top);
		List<GeneroEntity> entities = requestedPage.getContent();
		return entities;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<GeneroEntity> listGeneroPageable(int skip, int top) {
		return listGeneroPageable(skip, top, null, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<GeneroEntity> listGeneroPageable(int skip, int top, String orderBy) {
		return listGeneroPageable(skip, top, orderBy, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<GeneroEntity> listGeneroPageable(int skip, int top, String orderBy, String filter) {
		prepareSession();
		int page = skip * top; //zero-based page index.
		int size = top > 0 ? top : 10; //the size of the page to be returned.
		List<CustomOrder> customOrder = new ArrayList<>();
		if (orderBy != null && !orderBy.trim().isEmpty()) {
			String[] ordersby = orderBy.split(",");
			for (String orderby : ordersby) {
				String[] orderparts = orderby.trim().split("\\s+");
				boolean desc = orderparts.length > 1 && orderparts[1].toUpperCase().equals("DESC");
				CustomOrder co = new CustomOrder(orderparts[0]);
				co.setDesc(desc);
				customOrder.add(co);
			}
		}
		filter = replaceFilterEscapedChars(filter);
		FilterParameters filterParameters = null;
		try {
			filterParameters = filterParser.parseFilter(filter, GeneroEntity.class);
			filterParameters.setValues(getFixedValuesToFilter(filterParameters));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid filter.");	
		}
		
		// Throws an exception if find a custom field in the filter expression or order by expression.
		validateFilterCustomFields(filterParameters != null ? filterParameters.getColumns() : null, customOrder);
		
		Page<GeneroEntity> requestedPage = this.repository.findAllPageable(filterParameters, customOrder, page, size);
		return requestedPage;
	}
	
	private List<Object> getFixedValuesToFilter(FilterParameters filterParameters){
		return filterParameters.getValues().stream().map(value-> {
			if( value instanceof java.lang.String )
				return ((String) value).replace("''", "'");
			
			return value;
		}).collect(Collectors.toList());
	}
	
	private String replaceFilterEscapedChars(String filter){
		return filter == null ? null : filter.replace("\\'", "''");
	}
	
	private void validateFilterCustomFields(Set<String> filterFieldNames, List<CustomOrder> customOrders) {
		Set<String> entityFieldNames = IntrospectorUtil.getAllEntityFieldNamesByClass(GeneroEntity.class);
		
		// The filter must not contain custom fields.
		if (!CollectionUtils.isEmpty(filterFieldNames)) {
			filterFieldNames.forEach(filterFieldName -> {
				if (!entityFieldNames.contains(filterFieldName)) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid filter argument: " + filterFieldName);
				}
			});
		}
		
		// The orderby must not contain custom fields.
		if (!CollectionUtils.isEmpty(customOrders)) {
			customOrders.forEach(customOrder -> {
				if (!entityFieldNames.contains(customOrder.getField())) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid orderby argument: " + customOrder.getField());
				}
			});
		}
	}
	
	@Override
	public void createBulk(List<GeneroEntity> entities) {
		prepareSession();
		if (entities != null && !entities.isEmpty()) {
			this.repository.save(entities);
		}
	}
	
	@Override
	public void createBulkGenero(List<GeneroEntity> entities) {
		this.createBulk(entities);
	}
	
	private void prepareSession(){
		Session session = em.unwrap(Session.class);
		sessionInitializer.initialize(session, GeneroEntity.class);
	}
}
