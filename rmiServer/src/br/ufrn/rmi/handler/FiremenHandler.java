package br.ufrn.rmi.handler;


import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.enuns.Priority;

public class FiremenHandler extends ConstructHandler {
	
	
	public FiremenHandler() {
		reclamations.add(new Reclamation("Incêndio", Priority.URGENTE, 1));
		reclamations.add(new Reclamation("Resgate", Priority.URGENTE, 2));
		reclamations.add(new Reclamation("Resgate animal", Priority.MODERADA, 3));
		reclamations.add(new Reclamation("Acidente rodoviário", Priority.MODERADA, 4));
		reclamations.add(new Reclamation("Corte de árvores com risco iminente de queda", Priority.MODERADA, 5));
		reclamations.add(new Reclamation("Captura de animais que ofereçam risco à sociedade", Priority.MODERADA, 6));
		reclamations.add(new Reclamation("Inspeção nos equipamentos de segurança", Priority.BAIXA, 7));
		
	}
	
	@Override
	public String handleReclamation(String message) {
		Reclamation reclamation = reclamations.stream().filter(r -> r.getDepartmentIndex() == reclamationOption).findFirst().get();
		return "Reclamação enviada para o deparamento de bombeiros. Reclamação: "+toOptionString(reclamation);
		
	}

	@Override
	public String showReclamations() {
		return "Setor dos bombeiros"
				+ "\n"
				+ "1 - Inc�ndio\n"
				+ "2 - Resgate\n"
				+ "3 - Resgate animal\n"
				+ "4 - Acidente rodovi�rio\n"
				+ "5 - Corte de �rvores com risco iminente de queda\n"
				+ "6 - Captura de animais que ofere�am risco � sociedade\n"
				+ "7 - Inspe��o nos equipamentos de seguran�a\n"
				+ "\n"
				+ "100 - Outros\n"
				+ "\n"
				+ "0 - Finalizar\n"
				+ "\n"
				+ "Digite o n�mero correspondente a sua reclama��o: ";
	}

	
}
