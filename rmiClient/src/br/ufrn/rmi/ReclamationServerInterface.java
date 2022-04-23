package br.ufrn.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;		

public interface ReclamationServerInterface extends Remote {
	
	
	
	public String facedeMain() throws RemoteException;
	public String facedePolicemen()throws RemoteException;
	public String facedeFiremen()throws RemoteException;
	public String facedeAmbulationStation()throws RemoteException;
	public String facedeTownHall()throws RemoteException;
	public String facedeOption(int option)throws RemoteException;
	public String forwardingReclamation(int option)throws RemoteException;
	
	public void setReclamationOption(int option) throws RemoteException;
	public void setReclamationClassification(int option)throws RemoteException;
	public String showUserClassificationText() throws RemoteException;
	
}
