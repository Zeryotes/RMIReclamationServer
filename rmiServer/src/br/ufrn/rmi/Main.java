package br.ufrn.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		System.setProperty("java.rmi.server.hostname", "127.0.0.1");
		
		ReclamationServerInterface server = new ReclamationServer();
		
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("rmi://127.0.0.1:1099/ReclamationServer", server);
		
		System.out.println("Server Started.");

	}

}
