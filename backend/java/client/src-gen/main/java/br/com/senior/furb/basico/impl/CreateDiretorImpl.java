/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico.impl;

import java.util.function.Supplier;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.Message;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;			

import br.com.senior.furb.basico.*;
import java.util.concurrent.CompletableFuture;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.model.ServiceRunner;
import br.com.senior.furb.basico.Diretor;

/**
 * 
 */
public class CreateDiretorImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public CreateDiretorImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage(Diretor input) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				BasicoConstants.DOMAIN, //
				BasicoConstants.SERVICE, //
				BasicoConstants.Commands.CREATE_DIRETOR, //
				DtoJsonConverter.toJSON(input));
		}
		return new Message(userId.getTenant(), //
			BasicoConstants.DOMAIN, //
			BasicoConstants.SERVICE, //
			BasicoConstants.Commands.CREATE_DIRETOR, //
			DtoJsonConverter.toJSON(input));
	}
	
	/**
	* Chamada síncrona para o método createDiretor
	* This is a public operation
	* The 'create' request primitive for the Diretor entity. 
	* @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	*/
	public Diretor createDiretor(Diretor input, long timeout) {
		BasicoValidator.validate(input);
		
		Message message = createMessage(input);
		Message resultMessage; 
		try {
			addMessageHeaders(message);
			resultMessage = messengerSupplier.get().requestSync(message, timeout);
			messengerSupplier.get().ack(resultMessage);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
		
		if (resultMessage == null) {
			throw new BasicoException("Retorno inválido");
		}
		
		if (resultMessage.isError()) {
			ErrorPayload error = DtoJsonConverter.toDTO(resultMessage.getContent(), ErrorPayload.class);
			throw new BasicoMessageException(resultMessage.getErrorCategory(), error.getMessage(), error.getErrorCode());
		}
		Diretor output = DtoJsonConverter.toDTO(resultMessage.getContent(), Diretor.class);
		if (output == null) {
			throw new BasicoException("Contéudo do retorno inválido");
		}
		return output;
	}
	
	/**
	* Chamada assíncrona para o método createDiretor
	* This is a public operation
	* The 'create' request primitive for the Diretor entity.
	*/
	public void createDiretor(Diretor input) {
		BasicoValidator.validate(input);
		
		Message message = createMessage(input);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método createDiretor
	* This is a public operation
	* The 'create' request primitive for the Diretor entity.
	*/
	public CompletableFuture<Diretor> createDiretorRequest(Diretor input) {
		BasicoValidator.validate(input);
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		return serviceRunner.request(message, Diretor.class);
	}
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
