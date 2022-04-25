package br.ufrn.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;		

public interface ReclamationServerInterface extends Remote {
	
	
	
	public String facedeMain() throws RemoteException;
	public String facedeOption(int option)throws RemoteException;
	public String forwardingReclamation(int option)throws RemoteException;
	
	public String setReclamationOption(int option) throws RemoteException;
	public String setReclamationClassification(int option)throws RemoteException;
	public String showUserClassificationText() throws RemoteException;
	
}
