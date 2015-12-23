package net.charter.wjackson.decorator;

public class SteamedMilk extends CondimentDecorator {
	
	public SteamedMilk (Beverage.Builder builder) {
		super(builder);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return .10d + super.cost();
	}
}
