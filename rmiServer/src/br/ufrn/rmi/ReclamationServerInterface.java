package br.ufrn.rmi;

import java.io.InvalidObjectException;
import java.rmi.Remote;
import java.rmi.RemoteException;		

public interface ReclamationServerInterface extends Remote{
	
	public String getDepartments() throws RemoteException;
	public String getReclamationsByDepartment(int option)throws RemoteException;
	public String forwardingReclamation(int option)throws RemoteException;
	
	public String setReclamationOption(int option) throws RemoteException;
	public String setReclamationClassification(int option)throws RemoteException, InvalidObjectException;
	public String showUserClassificationText() throws RemoteException;
}
