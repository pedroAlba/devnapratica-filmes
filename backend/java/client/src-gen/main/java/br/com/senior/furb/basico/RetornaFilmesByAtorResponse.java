/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RetornaFilmesByAtorOutput;

/**
 * Response method for retornaFilmesByAtor
 */
@CommandDescription(name="retornaFilmesByAtorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retornaFilmesByAtorResponse")
public interface RetornaFilmesByAtorResponse extends MessageHandler {

	void retornaFilmesByAtorResponse(RetornaFilmesByAtorOutput response);
	
	void retornaFilmesByAtorResponseError(ErrorPayload error);

}
