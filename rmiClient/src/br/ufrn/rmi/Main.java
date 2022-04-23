package br.ufrn.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		HelloServerInterface server = (HelloServerInterface) Naming.lookup("rmi://127.0.0.1:1099/HelloServer");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(server.helloWorld());
		
		System.out.println("Digite seu nome: ");
		String name = sc.nextLine();
		
		server.hello(name);

	}

}
