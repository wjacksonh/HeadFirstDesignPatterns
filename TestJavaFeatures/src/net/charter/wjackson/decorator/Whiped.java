package net.charter.wjackson.decorator;

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
		return .20d + super.cost();
	}
}
