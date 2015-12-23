package com.wjsamples.designpatterns.compound;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate (duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall    = duckFactory.createDuckCall();
		Quackable rubberDuck  = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck  Simulator");
		
		simulate (mallardDuck);
		simulate (redheadDuck);
		simulate (duckCall);
		simulate (rubberDuck);
		simulate (gooseDuck);
		
		System.out.println("The ducks quaked " + QuackCounter.getQuacks() + " times");
	}

	private void simulate(Quackable q) {
		q.quack();
	}

}
