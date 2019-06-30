/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="diretorEhExperiente", kind=CommandKind.Action, requestPrimitive="diretorEhExperiente", responsePrimitive="diretorEhExperienteResponse")
public interface DiretorEhExperiente extends MessageHandler {
    
    public DiretorEhExperienteOutput diretorEhExperiente(DiretorEhExperienteInput request);
    
}
