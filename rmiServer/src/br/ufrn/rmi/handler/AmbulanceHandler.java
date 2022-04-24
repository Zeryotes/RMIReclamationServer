package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class AmbulanceHandler extends ConstructHandler {

	public AmbulanceHandler() {
		reclamations.add(new Reclamation("Infarto", Priority.HIGH, 1));
		reclamations.add(new Reclamation("Acidente de transito", Priority.HIGH, 2));
		reclamations.add(new Reclamation("Acidente com animais pesonhentos", Priority.HIGH,3));
		reclamations.add(new Reclamation("Choques Elétricos", Priority.HIGH, 4));
		reclamations.add(new Reclamation("Queimaduras", Priority.HIGH, 5));
		reclamations.add(new Reclamation("Cortes e Dilacerações", Priority.HIGH, 6));
		reclamations.add(new Reclamation("Febre", Priority.HIGH, 7));
		reclamations.add(new Reclamation("Overdose", Priority.HIGH, 8));
		reclamations.add(new Reclamation("Crise Alérgica", Priority.MEDIUM, 9));
		reclamations.add(new Reclamation("Fratura", Priority.MEDIUM, 10));
		reclamations.add(new Reclamation("Desmaio", Priority.MEDIUM, 11));
		reclamations.add(new Reclamation("Enjôo", Priority.LOW, 12));
		reclamations.add(new Reclamation("Enxaqueca", Priority.LOW, 13));
		reclamations.add(new Reclamation("Intoxicação alimentar", Priority.LOW, 14));
	}
	
	@Override
	public String handleReclamation(String message) {
		// TODO Auto-generated method stub
		return "Reclamação enviada para o deparamento de pronto socorro.";
	}

	@Override
	public String showReclamations() {
		String strReturn = "Departamento de pronto-socorro\n";
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
