/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="trocaDiretorFilme", kind=CommandKind.Action, requestPrimitive="trocaDiretorFilme", responsePrimitive="trocaDiretorFilmeResponse")
public interface TrocaDiretorFilme extends MessageHandler {
    
    public TrocaDiretorFilmeOutput trocaDiretorFilme(TrocaDiretorFilmeInput request);
    
}
