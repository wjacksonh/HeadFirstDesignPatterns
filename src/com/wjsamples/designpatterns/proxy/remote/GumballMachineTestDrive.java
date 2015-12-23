package com.wjsamples.designpatterns.proxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		
		int count = 0;
		
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		try {
			count = Integer.parseInt(args[1]);

			gumballMachine = new GumballMachine(args[0], count);
			
			GumballMachineRemote remote = (GumballMachineRemote)UnicastRemoteObject.exportObject(gumballMachine, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("//" + args[0] + "/gumballmachine", remote);
			System.out.println("Server Ready");
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}

}
