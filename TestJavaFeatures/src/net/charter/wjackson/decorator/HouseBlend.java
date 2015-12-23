package net.charter.wjackson.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend () {
		mDescription = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89d;
	}
}
