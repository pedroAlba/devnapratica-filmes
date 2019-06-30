package br.com.senior.furb.basico.handler;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.DiretorEhExperiente;
import br.com.senior.furb.basico.DiretorEhExperienteInput;
import br.com.senior.furb.basico.DiretorEhExperienteOutput;
import br.com.senior.furb.basico.RetornaFilmesByDiretor;
import br.com.senior.furb.basico.RetornaFilmesByDiretorInput;
import br.com.senior.furb.basico.RetornaFilmesByDiretorOutput;
import br.com.senior.furb.basico.TrocaDiretorFilme;
import br.com.senior.furb.basico.TrocaDiretorFilmeInput;
import br.com.senior.furb.basico.TrocaDiretorFilmeOutput;
import br.com.senior.furb.basico.repositories.DiretorRepositoryCustom;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class DiretorHandlerImpl implements RetornaFilmesByDiretor, TrocaDiretorFilme, DiretorEhExperiente{

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

	@Override
	public DiretorEhExperienteOutput diretorEhExperiente(DiretorEhExperienteInput request) {
		return new DiretorEhExperienteOutput(repository.diretorEhExperiente(request.diretor));
	}
}
