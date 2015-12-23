package com.wjsamples.designpatterns.decorator;

public class Soy extends CondimentDecorator {
	
	public Soy (Beverage.Builder builder) {
		super(builder);
	}
	
	@Override
	public Size getSize () {
		return mBeverage.getSize();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = super.cost();
		switch (getSize ()) {
			case TALL:   cost += .10; break;
			case GRANDE: cost += .15; break;
			case VENTI:  cost += .20; break;
		}
		return cost;
	}
}
