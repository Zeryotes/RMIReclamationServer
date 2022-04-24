package br.ufrn.rmi.handler;

import java.util.ArrayList;

import br.ufrn.rmi.Reclamation;

public abstract class ConstructHandler implements HandlerInterface {
	
	protected int reclamationOption;
	protected int reclamationClassification;
	ArrayList<Reclamation> reclamations = new ArrayList<>();
	
	public int getReclamationOption() {
		return reclamationOption;
	}
	
	public void setReclamationOption(int reclamationOption) {
		this.reclamationOption = reclamationOption;
	}
	
	public int getReclamationClassification() {
		return reclamationClassification;
	}
	
	public void setReclamationClassification(int reclamationClassification) {
		this.reclamationClassification = reclamationClassification;
	}
	
	public String toOptionString(Reclamation reclamation) {
		return String.format("%d - %s\n", reclamation.getDepartmentIndex(), reclamation.getDescription());
	}
	
}
