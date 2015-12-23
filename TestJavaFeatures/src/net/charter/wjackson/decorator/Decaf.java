package net.charter.wjackson.decorator;

public class Decaf extends Beverage {

	public Decaf () {
		mDescription = "Decaffinated Coffee";
	}
	
	@Override
	public double cost() {
		return 1.05d;
	}
}
