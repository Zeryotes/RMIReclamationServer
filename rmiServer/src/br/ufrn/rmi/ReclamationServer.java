package br.ufrn.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReclamationServer extends UnicastRemoteObject implements ReclamationServerInterface {

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
	public String facedePolicemen() throws RemoteException {
		return "Setor policial"
				+ "\n"
				+ "1 - Homic�dio\n"
				+ "2 - Sequestro\n"
				+ "3 - Tortura\n"
				+ "4 - Abuso sexual\n"
				+ "5 - Viol�ncia contra mulher\n"
				+ "6 - Pedofilia\n"
				+ "7 - Assalto a m�o armada\n"
				+ "8 - Assalto\n"
				+ "9 - Agress�o f�sica\n"
				+ "10 - Abuso psicol�gico\n"
				+ "11 - Tr�fico de drogas\n"
				+ "12 - Som alto\n"
				+ "13 - Tumulto, confus�o\n"
				+ "14 - Vandalismo\n"
				+ "15 - Atentado ao pudor\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o n�mero correspondente a sua reclama��o: ";
	}

	@Override
	public String facedeFiremen() throws RemoteException {
		return "Setor dos bombeiros"
				+ "\n"
				+ "1 - Inc�ndio\n"
				+ "2 - Resgate\n"
				+ "3 - Resgate animal\n"
				+ "4 - Acidente rodovi�rio\n"
				+ "5 - Corte de �rvores com risco iminente de queda\n"
				+ "6 - Captura de animais que ofere�am risco � sociedade\n"
				+ "7 - Inspe��o nos equipamentos de seguran�a\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o n�mero correspondente a sua reclama��o: ";
	}

	@Override
	public String facedeAmbulationStation() throws RemoteException {
		return "Setor de pronto-socorro"
				+ "\n"
				+ "1 - Infarto\n"
				+ "2 - Acidente de transito\n"
				+ "3 - Acidente com animais pe�onhentos\n"
				+ "4 - Choques El�tricos\n"
				+ "5 - Queimaduras\n"
				+ "6 - Cortes e Dilacera��es\n"
				+ "7 - Febre\n"
				+ "8 - Overdose\n"
				+ "9 - Crise al�rgica\n"
				+ "10 - Febre\n"
				+ "11 - Fratura\n"
				+ "12 - Desmaio\n"
				+ "13 - Enj�o\n"
				+ "14 - Enxaqueca\n"
				+ "15 - Intoxica��o alimentar\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o n�mero correspondente a sua reclama��o: ";
	}

	@Override
	public String facedeTownHall() throws RemoteException {
		return "Setor de pronto-socorro"
				+ "\n"
				+ "1 - Buraco na via\n"
				+ "2 - Saneamento b�sico\n"
				+ "3 - Polui��o ambiental\n"
				+ "4 - Manuten��o de escolas e creches p�blicas\n"
				+ "5 - Lixo nas ruas\n"
				+ "6 - Falta de sinaliza��o\n"
				+ "7 - Manuten��o de pra�a p�blica\n"
				+ "8 - Ilumina��o em via p�blica\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o n�mero correspondente a sua reclama��o: ";
	}

	@Override
	public String facedeOption(int option) throws RemoteException {
		switch (option) {
		case 1:
			return facedePolicemen();
		case 2:
			return facedeFiremen();
		case 3:
			return facedeAmbulationStation();
		case 4:
			return facedeTownHall();
		default:
			return "Valor inv�lido!";
		}
	}

	@Override
	public String forwardingReclamation(int option) throws RemoteException {
		return "Reclama��o encaminhada!";
	}

}
