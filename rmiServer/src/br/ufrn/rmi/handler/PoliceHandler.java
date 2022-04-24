package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class PoliceHandler extends ConstructHandler {

	public PoliceHandler() {
		reclamations.add(new Reclamation("Homic�dio", Priority.HIGH, 1));
		reclamations.add(new Reclamation("Sequestro", Priority.HIGH, 2));
		reclamations.add(new Reclamation("Tortura", Priority.HIGH,3));
		reclamations.add(new Reclamation("Abuso sexual", Priority.HIGH, 4));
		reclamations.add(new Reclamation("Viol�ncia contra mulher", Priority.HIGH, 5));
		reclamations.add(new Reclamation("Pedofilia", Priority.HIGH, 6));
		reclamations.add(new Reclamation("Assalto a m�o armada", Priority.HIGH, 7));
		reclamations.add(new Reclamation("Assalto", Priority.MEDIUM, 8));
		reclamations.add(new Reclamation("Agress�o f�sica", Priority.MEDIUM, 9));
		reclamations.add(new Reclamation("Abuso psicol�gico", Priority.MEDIUM, 10));
		reclamations.add(new Reclamation("Tr�fico de drogas", Priority.MEDIUM, 11));
		reclamations.add(new Reclamation("Som alto", Priority.LOW, 12));
		reclamations.add(new Reclamation("Tumulto, confus�o", Priority.LOW, 13));
		reclamations.add(new Reclamation("Vandalismo", Priority.LOW, 14));
		reclamations.add(new Reclamation("Atentado ao pudor", Priority.LOW, 15));
	
	}
	
	@Override
	public String handleReclamation(String message) {
		return "Reclama��o encaminhada para o departamento de pol�cia";
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
				+ "Digite o n�mero correspondente a sua reclama��o: ";
		return strReturn;
	}

}
