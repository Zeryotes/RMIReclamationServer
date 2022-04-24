package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class TownHallHandler extends ConstructHandler {
	
	public TownHallHandler() {
		reclamations.add(new Reclamation("Buraco na via", Priority.HIGH, 1));
		reclamations.add(new Reclamation("Saneamento básico", Priority.HIGH, 2));
		reclamations.add(new Reclamation("Poluição ambiental", Priority.HIGH,3));
		reclamations.add(new Reclamation("Manutenção de escolas e creches públicas", Priority.MEDIUM, 4));
		reclamations.add(new Reclamation("Lixo nas ruas", Priority.MEDIUM, 5));
		reclamations.add(new Reclamation("Falta de sinalização", Priority.HIGH, 6));
		reclamations.add(new Reclamation("Manutenção de praça pública", Priority.LOW, 7));
		reclamations.add(new Reclamation("Iluminação em via pública", Priority.HIGH, 8));
	}

	@Override
	public String handleReclamation(String message) {
		return "Reclamação enviada para a prefeitura";

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
				+ "Digite o número correspondente a sua reclamação: ";
		return strReturn;
	}

}
