/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RetornaFilmesByGeneroOutput;

/**
 * Response method for retornaFilmesByGenero
 */
@CommandDescription(name="retornaFilmesByGeneroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retornaFilmesByGeneroResponse")
public interface RetornaFilmesByGeneroResponse extends MessageHandler {

	void retornaFilmesByGeneroResponse(RetornaFilmesByGeneroOutput response);
	
	void retornaFilmesByGeneroResponseError(ErrorPayload error);

}
