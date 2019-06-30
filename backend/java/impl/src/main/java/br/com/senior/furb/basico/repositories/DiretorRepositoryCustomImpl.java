package br.com.senior.furb.basico.repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.senior.furb.basico.AtorEntity;
import br.com.senior.furb.basico.DiretorEntity;
import br.com.senior.furb.basico.Filme;
import br.com.senior.furb.basico.FilmeDTOConverter;
import br.com.senior.furb.basico.FilmeEntity;
import br.com.senior.furb.basico.QAtorEntity;
import br.com.senior.furb.basico.QDiretorEntity;
import br.com.senior.furb.basico.QFilmeEntity;
import br.com.senior.furb.basico.QGeneroEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class DiretorRepositoryCustomImpl extends RepositoryBaseJpa implements DiretorRepositoryCustom {

	@Autowired
	private FilmeDTOConverter converter;
	
@Autowired AtorRepository atorRepository;
	
	@Autowired FilmeRepository filmeRepository;
	
	
	@Override
	public List<Filme> findFilmesByNomeDiretor(String nome) {
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		List<FilmeEntity> filmes = select(qFilme).from(qFilme)
												 .leftJoin(qFilme.atores, QAtorEntity.atorEntity).fetchJoin()
												 .where(qFilme.diretor.nome.eq(nome))
												 .fetch();
		
		return filmes.stream().map(f -> converter.toDTO(f, Filme.class)).collect(Collectors.toList());
	}

	@Override
	public Filme trocaDiretorFilme(String diretor, String filme) {

		QDiretorEntity qDiretor = QDiretorEntity.diretorEntity;
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		
		DiretorEntity diretorFound = select(qDiretor).where(qDiretor.nome.eq(diretor)).fetchFirst();
		
		FilmeEntity filmeFound = select(qFilme).where(qFilme.nome.eq(filme)).fetchFirst();
		
		filmeFound.setDiretor(diretorFound);
		
		return converter.toDTO(filmeRepository.save(filmeFound), Filme.class);
	}

	@Override
	public Boolean diretorEhExperiente(String diretor) {

		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		long filmesQueDirige = select(qFilme).from(qFilme)
												 .where(qFilme.diretor.nome.eq(diretor))
												 .fetchCount();

		
		return filmesQueDirige > 5;
	}
}
