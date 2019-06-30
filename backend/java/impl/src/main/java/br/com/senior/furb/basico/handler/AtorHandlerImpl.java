package br.com.senior.furb.basico.handler;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.AdicionaAtorAoFilme;
import br.com.senior.furb.basico.AdicionaAtorAoFilmeInput;
import br.com.senior.furb.basico.AdicionaAtorAoFilmeOutput;
import br.com.senior.furb.basico.AtualizaStatusAtor;
import br.com.senior.furb.basico.AtualizaStatusAtorInput;
import br.com.senior.furb.basico.AtualizaStatusAtorOutput;
import br.com.senior.furb.basico.RetornaFilmesByAtor;
import br.com.senior.furb.basico.RetornaFilmesByAtorInput;
import br.com.senior.furb.basico.RetornaFilmesByAtorOutput;
import br.com.senior.furb.basico.repositories.AtorRepositoryCustom;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class AtorHandlerImpl implements RetornaFilmesByAtor, AdicionaAtorAoFilme, AtualizaStatusAtor {

	@Autowired
	private AtorRepositoryCustom repository;
	
	@Override
	public AdicionaAtorAoFilmeOutput adicionaAtorAoFilme(AdicionaAtorAoFilmeInput request) {
		return new AdicionaAtorAoFilmeOutput(repository.adicionaAtorAoFilme(request.ator, request.filme));
	}

	@Override
	public RetornaFilmesByAtorOutput retornaFilmesByAtor(RetornaFilmesByAtorInput request) {
		return new RetornaFilmesByAtorOutput(repository.findFilmesByAtor(request.ator));
	}

	@Override
	public AtualizaStatusAtorOutput atualizaStatusAtor(AtualizaStatusAtorInput request) {
		return new AtualizaStatusAtorOutput(repository.atualizaStatusAtor(request.ator));
	}
}
