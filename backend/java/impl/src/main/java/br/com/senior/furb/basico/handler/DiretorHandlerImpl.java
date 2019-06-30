package br.com.senior.furb.basico.handler;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.RetornaFilmesByDiretor;
import br.com.senior.furb.basico.RetornaFilmesByDiretorInput;
import br.com.senior.furb.basico.RetornaFilmesByDiretorOutput;
import br.com.senior.furb.basico.TrocaDiretorFilme;
import br.com.senior.furb.basico.TrocaDiretorFilmeInput;
import br.com.senior.furb.basico.TrocaDiretorFilmeOutput;
import br.com.senior.furb.basico.repositories.DiretorRepositoryCustom;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class DiretorHandlerImpl implements RetornaFilmesByDiretor, TrocaDiretorFilme{

	@Autowired
	private DiretorRepositoryCustom repository;
	
	@Override
	public RetornaFilmesByDiretorOutput retornaFilmesByDiretor(RetornaFilmesByDiretorInput request) {
		return new RetornaFilmesByDiretorOutput(repository.findFilmesByNomeDiretor(request.diretor));
	}

	@Override
	public TrocaDiretorFilmeOutput trocaDiretorFilme(TrocaDiretorFilmeInput request) {
		return new TrocaDiretorFilmeOutput(repository.trocaDiretorFilme(request.diretor, request.filme));
	}
}
