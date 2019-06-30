/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listFilme
 */
@CommandDescription(name="listFilmeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listFilmeResponse")
public interface ListFilmeResponse extends MessageHandler {

	void listFilmeResponse(Filme.PagedResults response);
	
	void listFilmeResponseError(ErrorPayload error);

}
