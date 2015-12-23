package net.charter.wjackson.decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage mBeverage;
	
	public CondimentDecorator (Beverage.Builder builder) {
		mBeverage = builder.get();
	}
	
	public String getDescription () {
		return mBeverage.getDescription();
	}

	@Override
	public double cost() {
		return mBeverage.cost();
	}
}
