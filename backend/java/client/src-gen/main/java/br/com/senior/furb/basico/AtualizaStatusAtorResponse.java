/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.AtualizaStatusAtorOutput;

/**
 * Response method for atualizaStatusAtor
 */
@CommandDescription(name="atualizaStatusAtorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="atualizaStatusAtorResponse")
public interface AtualizaStatusAtorResponse extends MessageHandler {

	void atualizaStatusAtorResponse(AtualizaStatusAtorOutput response);
	
	void atualizaStatusAtorResponseError(ErrorPayload error);

}
