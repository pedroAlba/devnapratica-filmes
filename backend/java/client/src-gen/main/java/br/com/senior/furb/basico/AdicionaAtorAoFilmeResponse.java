/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.AdicionaAtorAoFilmeOutput;

/**
 * Response method for adicionaAtorAoFilme
 */
@CommandDescription(name="adicionaAtorAoFilmeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="adicionaAtorAoFilmeResponse")
public interface AdicionaAtorAoFilmeResponse extends MessageHandler {

	void adicionaAtorAoFilmeResponse(AdicionaAtorAoFilmeOutput response);
	
	void adicionaAtorAoFilmeResponseError(ErrorPayload error);

}
