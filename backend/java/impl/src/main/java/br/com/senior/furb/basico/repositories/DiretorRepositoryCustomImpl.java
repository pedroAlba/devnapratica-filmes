package br.com.senior.furb.basico.repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.senior.furb.basico.Filme;
import br.com.senior.furb.basico.FilmeDTOConverter;
import br.com.senior.furb.basico.FilmeEntity;
import br.com.senior.furb.basico.QDiretorEntity;
import br.com.senior.furb.basico.QFilmeEntity;
import br.com.senior.furb.basico.QGeneroEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class DiretorRepositoryCustomImpl extends RepositoryBaseJpa implements DiretorRepositoryCustom {

	@Autowired
	private FilmeDTOConverter converter;
	
	@Override
	public List<Filme> findFilmesByNomeDiretor(String nome) {
		QFilmeEntity qFilme = QFilmeEntity.filmeEntity;
		List<FilmeEntity> filmes = select(qFilme).from(qFilme)
												 .where(qFilme.diretor.nome.eq(nome))
												 .leftJoin(qFilme.generos, QGeneroEntity.generoEntity)
												 .fetchJoin()
												 .leftJoin(qFilme.diretor, QDiretorEntity.diretorEntity)
												 .fetchJoin()
												 .fetch();
		return filmes.stream().map(f -> converter.toDTO(f, Filme.class)).collect(Collectors.toList());
	}
}
