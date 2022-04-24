package br.ufrn.rmi.handler;


import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class FiremenHandler extends ConstructHandler {
	
	public FiremenHandler() {
		reclamations.add(new Reclamation("Incêndio", Priority.HIGH, 1));
		reclamations.add(new Reclamation("Resgate", Priority.HIGH, 2));
		reclamations.add(new Reclamation("Resgate animal", Priority.MEDIUM, 3));
		reclamations.add(new Reclamation("Acidente rodoviário", Priority.MEDIUM, 4));
		reclamations.add(new Reclamation("Corte de árvores com risco iminente de queda", Priority.MEDIUM, 5));
		reclamations.add(new Reclamation("Captura de animais que ofereçam risco à sociedade", Priority.MEDIUM, 6));
		reclamations.add(new Reclamation("Inspeção nos equipamentos de segurança", Priority.LOW, 7));
	}
	
	@Override
	public String handleReclamation(String message) {
		Reclamation reclamation = reclamations.stream().filter(r -> r.getDepartmentIndex() == reclamationOption).findFirst().get();
		return "Reclamação enviada para o deparamento de bombeiros. Reclamação: "+toOptionString(reclamation);
		
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
				+ "Digite o número correspondente a sua reclamação: ";
		return strReturn;
	}

}
