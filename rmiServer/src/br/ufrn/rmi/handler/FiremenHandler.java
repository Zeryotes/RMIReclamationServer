package br.ufrn.rmi.handler;


import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class FiremenHandler extends ConstructHandler {
	
	public FiremenHandler() {
		departmentText = "Departamento de bombeiros\n";
		reclamations.add(new Reclamation("Incêndio", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Resgate", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Resgate animal", Priority.MODERADA, 3));
		reclamations.add(new Reclamation("Acidente rodovi�rio", Priority.MODERADA, 4));
		reclamations.add(new Reclamation("Corte de �rvores com risco iminente de queda", Priority.MODERADA, 5));
		reclamations.add(new Reclamation("Captura de animais que ofereçam risco à sociedade", Priority.MODERADA, 6));
		reclamations.add(new Reclamation("Inspeção nos equipamentos de segurança", Priority.BAIXA, 7));
	}
	
	@Override
	public String handleReclamation(String message) {
		Reclamation reclamation = reclamations.stream().filter(r -> r.getDepartmentIndex() == reclamationOption).findFirst().get();
		return ">> Reclamação enviada para o deparamento de bombeiros.\n\nRECLAMAÇÃO\n"+toOptionString(reclamation);
		
	}

	@Override
	public String showReclamations() {
		return super.showDepartmentReclamations(departmentText);
	}

}
