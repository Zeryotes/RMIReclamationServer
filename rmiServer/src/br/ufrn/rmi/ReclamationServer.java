package br.ufrn.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReclamationServer extends UnicastRemoteObject implements ReclamationServerInterface {

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
	public String facedePolicemen() throws RemoteException {
		return "Setor policial"
				+ "\n"
				+ "1 - Homicídio\n"
				+ "2 - Sequestro\n"
				+ "3 - Tortura\n"
				+ "4 - Abuso sexual\n"
				+ "5 - Violência contra mulher\n"
				+ "6 - Pedofilia\n"
				+ "7 - Assalto a mão armada\n"
				+ "8 - Assalto\n"
				+ "9 - Agressão física\n"
				+ "10 - Abuso psicológico\n"
				+ "11 - Tráfico de drogas\n"
				+ "12 - Som alto\n"
				+ "13 - Tumulto, confusão\n"
				+ "14 - Vandalismo\n"
				+ "15 - Atentado ao pudor\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o número correspondente a sua reclamação: ";
	}

	@Override
	public String facedeFiremen() throws RemoteException {
		return "Setor dos bombeiros"
				+ "\n"
				+ "1 - Incêndio\n"
				+ "2 - Resgate\n"
				+ "3 - Resgate animal\n"
				+ "4 - Acidente rodoviário\n"
				+ "5 - Corte de árvores com risco iminente de queda\n"
				+ "6 - Captura de animais que ofereçam risco à sociedade\n"
				+ "7 - Inspeção nos equipamentos de segurança\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o número correspondente a sua reclamação: ";
	}

	@Override
	public String facedeAmbulationStation() throws RemoteException {
		return "Setor de pronto-socorro"
				+ "\n"
				+ "1 - Infarto\n"
				+ "2 - Acidente de transito\n"
				+ "3 - Acidente com animais peçonhentos\n"
				+ "4 - Choques Elétricos\n"
				+ "5 - Queimaduras\n"
				+ "6 - Cortes e Dilacerações\n"
				+ "7 - Febre\n"
				+ "8 - Overdose\n"
				+ "9 - Crise alérgica\n"
				+ "10 - Febre\n"
				+ "11 - Fratura\n"
				+ "12 - Desmaio\n"
				+ "13 - Enjôo\n"
				+ "14 - Enxaqueca\n"
				+ "15 - Intoxicação alimentar\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o número correspondente a sua reclamação: ";
	}

	@Override
	public String facedeTownHall() throws RemoteException {
		return "Setor de pronto-socorro"
				+ "\n"
				+ "1 - Buraco na via\n"
				+ "2 - Saneamento básico\n"
				+ "3 - Poluição ambiental\n"
				+ "4 - Manutenção de escolas e creches públicas\n"
				+ "5 - Lixo nas ruas\n"
				+ "6 - Falta de sinalização\n"
				+ "7 - Manutenção de praça pública\n"
				+ "8 - Iluminação em via pública\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o número correspondente a sua reclamação: ";
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
			return "Valor inválido!";
		}
	}

	@Override
	public String forwardingReclamation(int option) throws RemoteException {
		return "Reclamação encaminhada!";
	}

}
