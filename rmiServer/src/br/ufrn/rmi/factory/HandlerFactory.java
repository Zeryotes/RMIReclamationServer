package br.ufrn.rmi.factory;

import br.ufrn.rmi.handler.AmbulanceHandler;
import br.ufrn.rmi.handler.ConstructHandler;
import br.ufrn.rmi.handler.FiremenHandler;
import br.ufrn.rmi.handler.PoliceHandler;
import br.ufrn.rmi.handler.TownHallHandler;

public final class HandlerFactory {

	public static ConstructHandler createHandler(int index) throws Exception {
		switch (index) {
		case 1:
			return new PoliceHandler();
		case 2:
			return new FiremenHandler();
		case 3:
			return new AmbulanceHandler();
		case 4:
			return new TownHallHandler();
		default:
			throw new Exception("Valor inválido.");
			
		}
	}
}
