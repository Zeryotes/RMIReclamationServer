package br.ufrn.rmi;

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
		return "Bem-vindo ao servidor de reclamações!\n"
				+ "\n"
				+ "Qual o setor da sua reclamação?\n"
				+ "1 - Policial\n"
				+ "2 - Bombeiros\n"
				+ "3 - Pronto-socorro\n"
				+ "4 - Prefeitura\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o número correspondente ao setor desejado: ";
	}


	@Override
	public String facedeOption(int option) throws RemoteException {
		try {
			handler = HandlerFactory.createHandler(option);
			return handler.showReclamations();
		} catch (Exception e) {
			return "Valor inválido";
		}
		
	}

	@Override
	public String forwardingReclamation(int option) throws RemoteException {
		return handler.handleReclamation("");
		
	}

	@Override
	public String showUserClassificationText() throws RemoteException {
		return "Classifique o grau de severidade para essa ocorrÃªncia, onde 1 Ã© o valor mÃ­nimo e 5 o valor mÃ¡ximo: ";
	}

	@Override
	public void setReclamationOption(int option) throws RemoteException {
		handler.setReclamationOption(option);
	}

	@Override
	public void setReclamationClassification(int option) throws RemoteException {
		handler.setReclamationClassification(option);
	}

}
