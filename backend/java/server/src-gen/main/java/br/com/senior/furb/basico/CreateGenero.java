/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Genero entity.
 */
@CommandDescription(name="createGenero", kind=CommandKind.Create, requestPrimitive="createGenero", responsePrimitive="createGeneroResponse")
public interface CreateGenero extends MessageHandler {
    
    public Genero createGenero(Genero toCreate);
    
}
