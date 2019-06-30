/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="generoEhFamoso", kind=CommandKind.Action, requestPrimitive="generoEhFamoso", responsePrimitive="generoEhFamosoResponse")
public interface GeneroEhFamoso extends MessageHandler {
    
    public GeneroEhFamosoOutput generoEhFamoso(GeneroEhFamosoInput request);
    
}
