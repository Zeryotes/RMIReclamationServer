package br.ufrn.rmi.handler;

import java.io.InvalidObjectException;
import java.util.ArrayList;

import br.ufrn.rmi.Reclamation;
import br.ufrn.rmi.exception.InvalidOptionException;

public abstract class ConstructHandler implements HandlerInterface {
	
	private static final String SUCESSO = "SUCESSO";
	private static final String FINALIZAR = "FINALIZAR";
	private static final String ERRO = "ERRO";
	protected String departmentText;
	protected int reclamationOption;
	protected int reclamationClassification;
	ArrayList<Reclamation> reclamations = new ArrayList<>();
	
	public int getReclamationOption() {
		return reclamationOption;
	}
	
	public String setReclamationOption(int reclamationOption) throws InvalidOptionException {
		if (reclamationOption == 0)
			throw new InvalidOptionException(FINALIZAR);
		else if (reclamationOption < 0 || reclamationOption > reclamations.size()) {
			throw new InvalidOptionException(ERRO);
		}
		this.reclamationOption = reclamationOption;
		return SUCESSO;
	}
	
	public int getReclamationClassification() {
		return reclamationClassification;
	}
	
	public String setReclamationClassification(int reclamationClassification) throws InvalidObjectException {
		if (reclamationClassification < 1 || reclamationClassification > 5) {
			throw new InvalidObjectException(ERRO);
		}
		this.reclamationClassification = reclamationClassification;
		return SUCESSO;
	}
	
	public String showDepartmentReclamations(String departmentText) {
		String strReturn = departmentText;
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
	
	public String toOptionString(Reclamation reclamation) {
		return String.format("Tipo de ocorrência:  %s \nPrioridade: %s\nGrau de severidade: %d\n", reclamation.getDescription(), reclamation.getPriority().name(), reclamationClassification);
	}
	
}
