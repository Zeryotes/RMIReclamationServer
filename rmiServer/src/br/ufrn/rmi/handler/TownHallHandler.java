package br.ufrn.rmi.handler;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class TownHallHandler extends ConstructHandler {
	
	public TownHallHandler() {
		departmentText = "Prefeitura\n";
		reclamations.add(new Reclamation("Buraco na via", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Saneamento b�sico", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Polui��o ambiental", Priority.URGENTE,3));
		reclamations.add(new Reclamation("Manuten��o de escolas e creches p�blicas", Priority.MODERADA, 4));
		reclamations.add(new Reclamation("Lixo nas ruas", Priority.MODERADA, 5));
		reclamations.add(new Reclamation("Falta de sinaliza��o", Priority.URGENTE, 6));
		reclamations.add(new Reclamation("Manuten��o de pra�a p�blica", Priority.BAIXA, 7));
		reclamations.add(new Reclamation("Ilumina��o em via p�blica", Priority.URGENTE, 8));
	}

	@Override
	public String handleReclamation(String message) {
		Reclamation reclamation = reclamations.stream().filter(r -> r.getDepartmentIndex() == reclamationOption).findFirst().get();
		return "Reclama��o enviada para a prefeitura. Reclama��o: "+toOptionString(reclamation);

	}

	@Override
	public String showReclamations() {
		return super.showDepartmentReclamations(departmentText);
	}

}
