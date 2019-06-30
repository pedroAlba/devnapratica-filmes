package br.com.senior.furb.basico.handler;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.RetornaFilmesByGenero;
import br.com.senior.furb.basico.RetornaFilmesByGeneroInput;
import br.com.senior.furb.basico.RetornaFilmesByGeneroOutput;
import br.com.senior.furb.basico.repositories.GeneroRepositoryCustom;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class GeneroHandlerImpl implements RetornaFilmesByGenero {

	@Autowired
	private GeneroRepositoryCustom repository;
	
	@Override
	public RetornaFilmesByGeneroOutput retornaFilmesByGenero(RetornaFilmesByGeneroInput request) {
		return new RetornaFilmesByGeneroOutput(repository.findFilmesByGenero(request.genero));
	}


}
