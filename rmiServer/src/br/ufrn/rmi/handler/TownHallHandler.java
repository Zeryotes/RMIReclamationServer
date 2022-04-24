package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class TownHallHandler extends ConstructHandler {
	
	public TownHallHandler() {
		reclamations.add(new Reclamation("Buraco na via", Priority.HIGH, 1));
		reclamations.add(new Reclamation("Saneamento b�sico", Priority.HIGH, 2));
		reclamations.add(new Reclamation("Polui��o ambiental", Priority.HIGH,3));
		reclamations.add(new Reclamation("Manuten��o de escolas e creches p�blicas", Priority.MEDIUM, 4));
		reclamations.add(new Reclamation("Lixo nas ruas", Priority.MEDIUM, 5));
		reclamations.add(new Reclamation("Falta de sinaliza��o", Priority.HIGH, 6));
		reclamations.add(new Reclamation("Manuten��o de pra�a p�blica", Priority.LOW, 7));
		reclamations.add(new Reclamation("Ilumina��o em via p�blica", Priority.HIGH, 8));
	}

	@Override
	public String handleReclamation(String message) {
		return "Reclama��o enviada para a prefeitura";

	}

	@Override
	public String showReclamations() {
		String strReturn = "Secrataria da prefeitura\n";
		for (Reclamation reclamation : reclamations) {
			strReturn += reclamation.getDepartmentIndex() + " - " + reclamation.getDescription() + "\n";
		}
		strReturn += "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "Digite o n�mero correspondente a sua reclama��o: ";
		return strReturn;
	}

}
