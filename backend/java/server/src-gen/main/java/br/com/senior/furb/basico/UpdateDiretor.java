/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Diretor entity.
 */
@CommandDescription(name="updateDiretor", kind=CommandKind.Update, requestPrimitive="updateDiretor", responsePrimitive="updateDiretorResponse")
public interface UpdateDiretor extends MessageHandler {
    
    public Diretor updateDiretor(Diretor toUpdate);
    
}
