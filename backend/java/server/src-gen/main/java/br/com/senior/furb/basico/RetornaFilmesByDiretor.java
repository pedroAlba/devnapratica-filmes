/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="retornaFilmesByDiretor", kind=CommandKind.Query, requestPrimitive="retornaFilmesByDiretor", responsePrimitive="retornaFilmesByDiretorResponse")
public interface RetornaFilmesByDiretor extends MessageHandler {
    
    public RetornaFilmesByDiretorOutput retornaFilmesByDiretor(RetornaFilmesByDiretorInput request);
    
}
