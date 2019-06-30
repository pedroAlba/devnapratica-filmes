package br.com.senior.furb.basico.repositories;

import java.util.List;

import br.com.senior.furb.basico.Filme;

public interface AtorRepositoryCustom {

	List<Filme> findFilmesByAtor(String nome);

	Filme adicionaAtorAoFilme(String ator, String filme);

	boolean atualizaStatusAtor(String ator);

}
