package br.ufrn.rmi;

import br.ufrn.rmi.enuns.Priority;

public class Reclamation {

	private String description;
	private Priority priority;
	private int departmentIndex;

	public Reclamation(String description, Priority priority, int departmentIndex) {
		this.description = description;
		this.priority = priority;
		this.departmentIndex = departmentIndex;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	public int getDepartmentIndex() {
		return departmentIndex;
	}

	public void setDepartmentIndex(int departmentIndex) {
		this.departmentIndex = departmentIndex;
	}
	
}
