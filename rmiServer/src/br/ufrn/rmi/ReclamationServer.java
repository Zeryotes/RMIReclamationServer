package br.ufrn.rmi;

import java.io.InvalidObjectException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.ufrn.rmi.factory.HandlerFactory;
import br.ufrn.rmi.handler.ConstructHandler;
import br.ufrn.rmi.handler.HandlerInterface;

public class ReclamationServer extends UnicastRemoteObject implements ReclamationServerInterface {

	private ConstructHandler handler;
	
	protected ReclamationServer() throws RemoteException {
		super();
	}
	
	@Override
	public String facedeMain() throws RemoteException {
		return "Bem-vindo ao servidor de reclama��es!\n"
				+ "\n"
				+ "Qual o setor da sua reclama��o?\n"
				+ "1 - Policial\n"
				+ "2 - Bombeiros\n"
				+ "3 - Pronto-socorro\n"
				+ "4 - Prefeitura\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o n�mero correspondente ao setor desejado: ";
	}


	@Override
	public String facedeOption(int option) throws RemoteException {
		try {
			handler = HandlerFactory.createHandler(option);
			return handler.showReclamations();
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

	@Override
	public String forwardingReclamation(int option) throws RemoteException {
		return handler.handleReclamation("");
		
	}

	@Override
	public String showUserClassificationText() throws RemoteException {
		return "Classifique o grau de severidade para essa ocorr�ncia, onde 1 � o valor m�nimo e 5 o valor m�ximo: ";
	}

	@Override
	public String setReclamationOption(int option) throws RemoteException {
		try {
			return handler.setReclamationOption(option);
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

	@Override
	public String setReclamationClassification(int option) throws RemoteException, InvalidObjectException {
		try {
			return handler.setReclamationClassification(option);
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

}
