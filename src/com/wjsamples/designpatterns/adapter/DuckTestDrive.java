package com.wjsamples.designpatterns.adapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey Says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says...");
		testDuck (duck);
		
		System.out.println("\nThe TurkeyAdapter Says...");
		testDuck (turkeyAdapter);
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
