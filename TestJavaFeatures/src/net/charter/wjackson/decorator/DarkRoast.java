package net.charter.wjackson.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast () {
		mDescription = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return .99d;
	}
}
