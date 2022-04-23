package br.ufrn.rmi.handler;

public class TownHallHandler extends ConstructHandler {

	@Override
	public String handleReclamation(String message) {
		return "Reclamação enviada para a prefeitura";

	}

	@Override
	public String showReclamations() {
		return "Setor de prefeitura"
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

}
