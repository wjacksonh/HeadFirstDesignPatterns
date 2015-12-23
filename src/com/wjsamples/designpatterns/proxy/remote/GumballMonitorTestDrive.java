package com.wjsamples.designpatterns.proxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		String[] location = {"//santafe.mightygumball.com/gumballmachine",
							 "//boulder.mightygumball.com/gumballmachine",
							 "//seatle.mightygumball.com/gumballmachine"};
		
		GumballMonitor[] monitors = new GumballMonitor[location.length];
		
		for (int i = 0; i < location.length; i++) {
			try {
				Registry registry = LocateRegistry.getRegistry(null);
				GumballMachineRemote machine = (GumballMachineRemote)registry.lookup(location[i]);
								
				monitors[i] = new GumballMonitor(machine);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (GumballMonitor m : monitors) {
			m.report();
		}
	}

}
