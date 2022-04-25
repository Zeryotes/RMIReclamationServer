package br.ufrn.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

import br.ufrn.rmi.exception.EndProgramException;

public class Main {

	private static final String VALOR_INVALIDO = "ERRO";
	
	public static void main(String[] args) throws Exception {
		ReclamationServerInterface server = (ReclamationServerInterface) Naming.lookup("rmi://127.0.0.1:1099/ReclamationServer");
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			showSeparator();
			showDepartments(server);
			
			int option = sc.nextInt();
			showDepartmentReclamations(server, option, sc);
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
	
	public static void showDepartmentReclamations(ReclamationServerInterface server, int option, Scanner sc) throws EndProgramException, RemoteException {
		String message = server.facedeOption(option);
		validateEndProgramMessage(message);
		if (message.equals(VALOR_INVALIDO)) {
			System.out.println("\nOpção escolhida inválida. Por favor, escolha outro valor: ");
			option = sc.nextInt();
			showDepartmentReclamations(server, option, sc);
		}
		
		if (!message.equals(VALOR_INVALIDO))
			System.out.println(message);
	}
	
	public static void showReclamationClassificationText(ReclamationServerInterface server) throws RemoteException  {
		System.out.println(server.showUserClassificationText());
	}
	
	public static void receiveInput(Scanner sc, int option) {
		option = sc.nextInt();
	}
	
	public static void setReclamation(ReclamationServerInterface server, Scanner sc, int option) throws EndProgramException, RemoteException {
		option = sc.nextInt();
		String result = server.setReclamationOption(option);
		validateEndProgramMessage(result);
		if (result.equals(VALOR_INVALIDO)) {
			System.out.println("\nOpção escolhida inválida. Por favor, escolha outro valor: ");
			setReclamation(server, sc, option);
		}
	}

	public static void setReclamationClassification(ReclamationServerInterface server, Scanner sc, int option) throws RemoteException {
		option = sc.nextInt();
		String result = server.setReclamationClassification(option);
		if (result.equals(VALOR_INVALIDO)) {
			System.out.println("\nOpção escolhida inválida. Por favor, escolha outro valor: ");
			setReclamationClassification(server, sc, option);
		}
	}
	
	public static void validateEndProgramMessage(String message) throws EndProgramException {
		if (message.equals("FINALIZAR")) {
			throw new EndProgramException("Finalizando programa...");
		}
	}
	
}
