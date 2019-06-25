package br.com.senior.furb.basico.handler;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.RetornaFilmesByDiretor;
import br.com.senior.furb.basico.RetornaFilmesByDiretorInput;
import br.com.senior.furb.basico.RetornaFilmesByDiretorOutput;
import br.com.senior.furb.basico.repositories.DiretorRepositoryCustom;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class DiretorHandlerImpl implements RetornaFilmesByDiretor {

	@Autowired
	private DiretorRepositoryCustom repository;
	
	@Override
	public RetornaFilmesByDiretorOutput retornaFilmesByDiretor(RetornaFilmesByDiretorInput request) {
		return new RetornaFilmesByDiretorOutput(repository.findFilmesByNomeDiretor(request.diretor));
	}

}
