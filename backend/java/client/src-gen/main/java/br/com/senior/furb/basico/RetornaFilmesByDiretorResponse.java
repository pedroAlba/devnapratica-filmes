/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RetornaFilmesByDiretorOutput;

/**
 * Response method for retornaFilmesByDiretor
 */
@CommandDescription(name="retornaFilmesByDiretorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retornaFilmesByDiretorResponse")
public interface RetornaFilmesByDiretorResponse extends MessageHandler {

	void retornaFilmesByDiretorResponse(RetornaFilmesByDiretorOutput response);
	
	void retornaFilmesByDiretorResponseError(ErrorPayload error);

}
