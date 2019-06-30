/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.DiretorEhExperienteOutput;

/**
 * Response method for diretorEhExperiente
 */
@CommandDescription(name="diretorEhExperienteResponse", kind=CommandKind.ResponseCommand, requestPrimitive="diretorEhExperienteResponse")
public interface DiretorEhExperienteResponse extends MessageHandler {

	void diretorEhExperienteResponse(DiretorEhExperienteOutput response);
	
	void diretorEhExperienteResponseError(ErrorPayload error);

}
