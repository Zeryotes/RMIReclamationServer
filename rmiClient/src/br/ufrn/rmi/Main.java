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
		
		System.out.println(server.facedeMain());
		int option = sc.nextInt();
		System.out.println(server.facedeOption(option));
		
		option = sc.nextInt();
		System.out.println(server.forwardingReclamation(option));
		

	}

}
