package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class AmbulanceHandler extends ConstructHandler {

	public AmbulanceHandler() {
		reclamations.add(new Reclamation("Infarto", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Acidente de transito", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Acidente com animais pesonhentos", Priority.URGENTE,3));
		reclamations.add(new Reclamation("Choques El�tricos", Priority.URGENTE, 4));
		reclamations.add(new Reclamation("Queimaduras", Priority.URGENTE, 5));
		reclamations.add(new Reclamation("Cortes e Dilacera��es", Priority.URGENTE, 6));
		reclamations.add(new Reclamation("Febre", Priority.URGENTE, 7));
		reclamations.add(new Reclamation("Overdose", Priority.URGENTE, 8));
		reclamations.add(new Reclamation("Crise Al�rgica", Priority.MODERADA, 9));
		reclamations.add(new Reclamation("Fratura", Priority.MODERADA, 10));
		reclamations.add(new Reclamation("Desmaio", Priority.MODERADA, 11));
		reclamations.add(new Reclamation("Enj�o", Priority.BAIXA, 12));
		reclamations.add(new Reclamation("Enxaqueca", Priority.BAIXA, 13));
		reclamations.add(new Reclamation("Intoxica��o alimentar", Priority.BAIXA, 14));
	}
	
	@Override
	public String handleReclamation(String message) {
		// TODO Auto-generated method stub
		return "Reclama��o enviada para o deparamento de pronto socorro.";
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
				+ "Digite o n�mero correspondente a sua reclama��o: ";
		return strReturn;
	}

}
