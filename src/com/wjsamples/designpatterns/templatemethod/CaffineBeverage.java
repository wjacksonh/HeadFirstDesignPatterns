package com.wjsamples.designpatterns.templatemethod;

public abstract class CaffineBeverage {
	final void prepareRecipe () {
		boilWater ();
		brew ();
		pourInCup ();
		if (customerWantsCondiments()) {
			addCondiments ();
		}
	}

	abstract void brew();
	abstract void addCondiments();

	final public void boilWater() {
		System.out.println("Boiling water");			
	}
	
	final public void pourInCup() {
		System.out.println("Pouring into Cup");	
	}
	
	boolean customerWantsCondiments () {
		return true;
	}
}
