package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class PoliceHandler extends ConstructHandler {

	public PoliceHandler() {
		reclamations.add(new Reclamation("Homicídio", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Sequestro", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Tortura", Priority.URGENTE,3));
		reclamations.add(new Reclamation("Abuso sexual", Priority.URGENTE, 4));
		reclamations.add(new Reclamation("Violência contra mulher", Priority.URGENTE, 5));
		reclamations.add(new Reclamation("Pedofilia", Priority.URGENTE, 6));
		reclamations.add(new Reclamation("Assalto a mão armada", Priority.URGENTE, 7));
		reclamations.add(new Reclamation("Assalto", Priority.MODERADA, 8));
		reclamations.add(new Reclamation("Agressão física", Priority.MODERADA, 9));
		reclamations.add(new Reclamation("Abuso psicológico", Priority.MODERADA, 10));
		reclamations.add(new Reclamation("Tráfico de drogas", Priority.MODERADA, 11));
		reclamations.add(new Reclamation("Som alto", Priority.BAIXA, 12));
		reclamations.add(new Reclamation("Tumulto, confusão", Priority.BAIXA, 13));
		reclamations.add(new Reclamation("Vandalismo", Priority.BAIXA, 14));
		reclamations.add(new Reclamation("Atentado ao pudor", Priority.BAIXA, 15));
	
	}
	
	@Override
	public String handleReclamation(String message) {
		return "Reclamação encaminhada para o departamento de polícia";
	}

	@Override
	public String showReclamations() {
		String strReturn = "Departamento policial\n";
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
