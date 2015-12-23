package net.charter.wjackson.decorator;

public class Mocha extends CondimentDecorator {
	
	public Mocha (Beverage.Builder builder) {
		super(builder);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20d + super.cost();
	}
}
