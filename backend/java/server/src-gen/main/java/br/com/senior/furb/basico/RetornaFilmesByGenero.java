/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="retornaFilmesByGenero", kind=CommandKind.Query, requestPrimitive="retornaFilmesByGenero", responsePrimitive="retornaFilmesByGeneroResponse")
public interface RetornaFilmesByGenero extends MessageHandler {
    
    public RetornaFilmesByGeneroOutput retornaFilmesByGenero(RetornaFilmesByGeneroInput request);
    
}
