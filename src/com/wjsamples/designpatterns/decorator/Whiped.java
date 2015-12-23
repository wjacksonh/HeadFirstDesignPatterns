package com.wjsamples.designpatterns.decorator;

public class Whiped extends CondimentDecorator {
	
	public Whiped (Beverage.Builder builder) {
		super(builder);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Whiped Cream";
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
