package br.com.senior.furb.basico.repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.senior.furb.basico.Filme;
import br.com.senior.furb.basico.FilmeDTOConverter;
import br.com.senior.furb.basico.FilmeEntity;
import br.com.senior.furb.basico.GeneroEntity;
import br.com.senior.furb.basico.QFilmeEntity;
import br.com.senior.furb.basico.QGeneroEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class GeneroRepositoryCustomImpl extends RepositoryBaseJpa implements GeneroRepositoryCustom {

@Autowired AtorRepository atorRepository;
	
	@Autowired FilmeRepository filmeRepository;
	
	@Autowired
	private FilmeDTOConverter converter;
	
	@Override
	public List<Filme> findFilmesByGenero(String genero) {
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		QGeneroEntity qGenero = QGeneroEntity.generoEntity;
		List<FilmeEntity> filmes = select(qFilme).from(qFilme)
												 .leftJoin(qFilme.genero, qGenero)
												 .where(qGenero.nome.eq(genero))
												 .fetch();
		
		return filmes.stream().map(f -> converter.toDTO(f, Filme.class)).collect(Collectors.toList());
	}

	@Override
	public Filme setGeneroFilme(String genero, String filme) {
		
		QGeneroEntity qGenero = QGeneroEntity.generoEntity;
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		
		GeneroEntity generoEntity = select(qGenero).where(qGenero.nome.eq(genero)).fetchFirst();
		
		FilmeEntity filmeFound = select(qFilme).where(qFilme.nome.eq(filme)).fetchFirst();
		
		filmeFound.setGenero(generoEntity);
		
		return converter.toDTO(filmeRepository.save(filmeFound), Filme.class);
	}

	@Override
	public Boolean generoEhFamoso(String genero) {
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		long filmesQueDirige = select(qFilme).from(qFilme)
												 .where(qFilme.genero.nome.eq(genero))
												 .fetchCount();
		return filmesQueDirige > 5;
	}
}
