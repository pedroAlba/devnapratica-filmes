/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="retornaFilmesByAtor", kind=CommandKind.Query, requestPrimitive="retornaFilmesByAtor", responsePrimitive="retornaFilmesByAtorResponse")
public interface RetornaFilmesByAtor extends MessageHandler {
    
    public RetornaFilmesByAtorOutput retornaFilmesByAtor(RetornaFilmesByAtorInput request);
    
}
