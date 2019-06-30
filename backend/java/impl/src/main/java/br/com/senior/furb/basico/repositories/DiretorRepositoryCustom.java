package br.com.senior.furb.basico.repositories;

import java.util.List;

import br.com.senior.furb.basico.DiretorBaseRepository;
import br.com.senior.furb.basico.Filme;

public interface DiretorRepositoryCustom  {

	List<Filme> findFilmesByNomeDiretor(String nome);

	Filme trocaDiretorFilme(String diretor, String filme);

	Boolean diretorEhExperiente(String diretor);
	
}
