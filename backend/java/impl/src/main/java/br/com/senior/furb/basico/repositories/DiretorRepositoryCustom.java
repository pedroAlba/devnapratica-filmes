package br.com.senior.furb.basico.repositories;

import java.util.List;

import br.com.senior.furb.basico.Filme;

public interface DiretorRepositoryCustom {

	List<Filme> findFilmesByNomeDiretor(String nome);
	
}
