package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class PoliceHandler extends ConstructHandler {

	public PoliceHandler() {
		departmentText = "Departamento de polícia\n";
		reclamations.add(new Reclamation("Homic�dio", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Sequestro", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Tortura", Priority.URGENTE,3));
		reclamations.add(new Reclamation("Abuso sexual", Priority.URGENTE, 4));
		reclamations.add(new Reclamation("Viol�ncia contra mulher", Priority.URGENTE, 5));
		reclamations.add(new Reclamation("Pedofilia", Priority.URGENTE, 6));
		reclamations.add(new Reclamation("Assalto a m�o armada", Priority.URGENTE, 7));
		reclamations.add(new Reclamation("Assalto", Priority.MODERADA, 8));
		reclamations.add(new Reclamation("Agress�o f�sica", Priority.MODERADA, 9));
		reclamations.add(new Reclamation("Abuso psicol�gico", Priority.MODERADA, 10));
		reclamations.add(new Reclamation("Tr�fico de drogas", Priority.MODERADA, 11));
		reclamations.add(new Reclamation("Som alto", Priority.BAIXA, 12));
		reclamations.add(new Reclamation("Tumulto, confus�o", Priority.BAIXA, 13));
		reclamations.add(new Reclamation("Vandalismo", Priority.BAIXA, 14));
		reclamations.add(new Reclamation("Atentado ao pudor", Priority.BAIXA, 15));
	
	}
	
	@Override
	public String handleReclamation(String message) {
		Reclamation reclamation = reclamations.stream().filter(r -> r.getDepartmentIndex() == reclamationOption).findFirst().get();
		return "Reclama��o encaminhada para o departamento de pol�cia. Reclamação: "+toOptionString(reclamation);
	}

	@Override
	public String showReclamations() {
		return super.showDepartmentReclamations(departmentText);
	}


}
