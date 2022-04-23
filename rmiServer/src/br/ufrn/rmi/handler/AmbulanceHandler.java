package br.ufrn.rmi.handler;

public class AmbulanceHandler extends ConstructHandler {

	@Override
	public String handleReclamation(String message) {
		// TODO Auto-generated method stub
		return "Reclamação enviada para o deparamento de pronto socorro.";
	}

	@Override
	public String showReclamations() {
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

}
