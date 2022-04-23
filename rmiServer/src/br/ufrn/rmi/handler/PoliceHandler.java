package br.ufrn.rmi.handler;

public class PoliceHandler extends ConstructHandler {

	@Override
	public String handleReclamation(String message) {
		return "Reclamação encaminhada para o departamento de polícia";
	}

	@Override
	public String showReclamations() {
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

}
