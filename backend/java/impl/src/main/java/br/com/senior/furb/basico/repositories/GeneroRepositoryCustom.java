package br.com.senior.furb.basico.repositories;

import java.util.List;

import br.com.senior.furb.basico.Filme;


public interface GeneroRepositoryCustom  {

	List<Filme> findFilmesByGenero(String genero);

	Filme setGeneroFilme(String genero, String filme);
}
