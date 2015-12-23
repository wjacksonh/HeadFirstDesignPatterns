package com.wjsamples.designpatterns.singleton;

public class TestSingleton {

	private static class ChoclolateRunnable implements Runnable {
		
		@Override
		public void run() {
			ChocolateFactory cf = ChocolateFactory.getInstance();
			cf.fill();
			cf.boil();
			cf.drain();
			System.err.println("Completed ChoclolateRunnable " + this.toString());
		}
	};
	
	public static void main(String[] args) {

		System.err.println("Before start");
		Thread t1 = new Thread(new ChoclolateRunnable ());
		Thread t2 = new Thread(new ChoclolateRunnable ());

		try {
			t1.start();
			t2.start();
			System.err.println("After start");
			
			System.err.println("Waiting for t1");
			if (t1.isAlive()) {
				System.err.println("t1 is alive so join");
				t1.join();
			}
			System.err.println("Waiting for t2");
			if (t2.isAlive()) {
				System.err.println("t2 is alive so join");
				t2.join();
			}
		}
		catch (InterruptedException ex) {
			System.out.println("InterruptedException: " + ex.toString());
			ex.printStackTrace();
		} finally {
			System.err.println("Fianlly");
		}
		System.err.println("Exiting...");
	}
}
