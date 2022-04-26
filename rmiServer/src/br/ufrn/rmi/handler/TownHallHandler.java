package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class TownHallHandler extends ConstructHandler {
	
	public TownHallHandler() {
		departmentText = "Prefeitura\n";
		reclamations.add(new Reclamation("Buraco na via", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Saneamento básico", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Poluição ambiental", Priority.URGENTE,3));
		reclamations.add(new Reclamation("Manutenção de escolas e creches públicas", Priority.MODERADA, 4));
		reclamations.add(new Reclamation("Lixo nas ruas", Priority.MODERADA, 5));
		reclamations.add(new Reclamation("Falta de sinalização", Priority.URGENTE, 6));
		reclamations.add(new Reclamation("Manutenção de praça pública", Priority.BAIXA, 7));
		reclamations.add(new Reclamation("Iluminação em via pública", Priority.URGENTE, 8));
	}

	@Override
	public String handleReclamation(String message) {
		Reclamation reclamation = reclamations.stream().filter(r -> r.getDepartmentIndex() == reclamationOption).findFirst().get();
		return ">> Reclamação enviada para a prefeitura.\n\nRECLAMAÇÃO\n"+toOptionString(reclamation);

	}

	@Override
	public String showReclamations() {
		return super.showDepartmentReclamations(departmentText);
	}

}
