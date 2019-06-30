/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="atualizaStatusAtor", kind=CommandKind.Action, requestPrimitive="atualizaStatusAtor", responsePrimitive="atualizaStatusAtorResponse")
public interface AtualizaStatusAtor extends MessageHandler {
    
    public AtualizaStatusAtorOutput atualizaStatusAtor(AtualizaStatusAtorInput request);
    
}
