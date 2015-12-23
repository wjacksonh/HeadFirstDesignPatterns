package com.wjsamples.designpatterns.proxy.remote;

import java.rmi.RemoteException;

public class GumballMonitor {
	private GumballMachineRemote mMachine;
	
	public GumballMonitor (GumballMachineRemote machine) {
		mMachine = machine;
	}
	
	public void report () {
		
		try {
			System.out.println("Gumball Machine: " + mMachine.getLocation());
			System.out.println("Current Inventory: " + mMachine.getCount());
			System.out.println("Current State: " + mMachine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
