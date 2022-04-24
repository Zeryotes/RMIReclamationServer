package br.ufrn.rmi.handler;


import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class FiremenHandler extends ConstructHandler {
	
	public FiremenHandler() {
		reclamations.add(new Reclamation("Inc�ndio", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Resgate", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Resgate animal", Priority.MODERADA, 3));
		reclamations.add(new Reclamation("Acidente rodovi�rio", Priority.MODERADA, 4));
		reclamations.add(new Reclamation("Corte de �rvores com risco iminente de queda", Priority.MODERADA, 5));
		reclamations.add(new Reclamation("Captura de animais que ofere�am risco � sociedade", Priority.MODERADA, 6));
		reclamations.add(new Reclamation("Inspe��o nos equipamentos de seguran�a", Priority.BAIXA, 7));
	}
	
	@Override
	public String handleReclamation(String message) {
		Reclamation reclamation = reclamations.stream().filter(r -> r.getDepartmentIndex() == reclamationOption).findFirst().get();
		return "Reclama��o enviada para o deparamento de bombeiros. Reclama��o: "+toOptionString(reclamation);
		
	}

	@Override
	public String showReclamations() {
		String strReturn = "Departamento dos bombeiros\n";
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
