package br.com.senior.furb.basico.repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAUpdateClause;

import br.com.senior.furb.basico.AtorEntity;
import br.com.senior.furb.basico.Filme;
import br.com.senior.furb.basico.FilmeDTOConverter;
import br.com.senior.furb.basico.FilmeEntity;
import br.com.senior.furb.basico.QAtorEntity;
import br.com.senior.furb.basico.QFilmeEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class AtorRepositoryCustomImpl extends RepositoryBaseJpa implements AtorRepositoryCustom {

	@Autowired AtorRepository atorRepository;
	
	@Autowired FilmeRepository filmeRepository;
	
	@Autowired
	private FilmeDTOConverter converter;
	
	@Override
	public List<Filme> findFilmesByAtor(String nome) {
		
		QAtorEntity qAtor = QAtorEntity.atorEntity;
		
		AtorEntity ator = select(qAtor).from(qAtor).where(qAtor.nome.eq(nome)).fetchFirst();
		
		//TODO: Resource not found, como tratar? 
		if(ator == null) {
			ator = new AtorEntity();
		}
		
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		List<FilmeEntity> filmes = select(qFilme).from(qFilme)
												 .where(qFilme.atores.contains(ator))
												 .fetch();
		return filmes.stream().map(f -> converter.toDTO(f, Filme.class)).collect(Collectors.toList());
	}

	@Override
	public Filme adicionaAtorAoFilme(String ator, String filme) {
		
		QAtorEntity qAtor = QAtorEntity.atorEntity;
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		
		AtorEntity atorFound = select(qAtor).from(qAtor).where(qAtor.nome.eq(ator)).fetchFirst();
		
		if(atorFound == null) {
			atorFound = new AtorEntity();
		}
		
		FilmeEntity filmeFound = select(qFilme).from(qFilme).where(qFilme.nome.eq(filme)).fetchFirst();
		
		filmeFound.getAtores().add(atorFound);
		
		
		return converter.toDTO(filmeRepository.save(filmeFound), Filme.class);
	}

	@Override
	public boolean atualizaStatusAtor(String ator) {
		
		QAtorEntity qAtor = QAtorEntity.atorEntity;
		
		AtorEntity atorE = select(qAtor).from(qAtor).where(qAtor.nome.eq(ator)).fetchFirst();
		
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		long filmesQueParticipa = select(qFilme).from(qFilme)
												 .where(qFilme.atores.contains(atorE))
												 .fetchCount();
		
		if(filmesQueParticipa >= 3) {
			atorE.setEhRico(true);
			atorE = atorRepository.save(atorE);
		}
		
		return atorE.getEhRico();
	}
}
