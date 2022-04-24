package br.ufrn.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		ReclamationServerInterface server = (ReclamationServerInterface) Naming.lookup("rmi://127.0.0.1:1099/ReclamationServer");
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			showSeparator();
			showDepartments(server);
			
			int option = sc.nextInt();
			showDepartmentReclamations(server, option);
			setReclamation(server, sc, option);
			
			showReclamationClassificationText(server);
			setReclamationClassification(server, sc, option);
			
			System.out.println(server.forwardingReclamation(option));
		
		}

	}
	
	public static void showSeparator() {
		System.out.println("\n-----------------------------------------\n");
	}
	
	public static void showDepartments(ReclamationServerInterface server) throws RemoteException {
		System.out.println(server.facedeMain());
	}
	
	public static void showDepartmentReclamations(ReclamationServerInterface server, int option) throws RemoteException {
		System.out.println(server.facedeOption(option));
	}
	
	public static void showReclamationClassificationText(ReclamationServerInterface server) throws RemoteException  {
		System.out.println(server.showUserClassificationText());
	}
	
	public static void receiveInput(Scanner sc, int option) {
		option = sc.nextInt();
	}
	
	public static void setReclamation(ReclamationServerInterface server, Scanner sc, int option) throws RemoteException {
		receiveInput(sc, option);
		server.setReclamationOption(option);
	}

	public static void setReclamationClassification(ReclamationServerInterface server, Scanner sc, int option) throws RemoteException {
		receiveInput(sc, option);
		server.setReclamationClassification(option);
	}
}
