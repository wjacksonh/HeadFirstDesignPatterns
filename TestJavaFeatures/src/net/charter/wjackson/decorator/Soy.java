package net.charter.wjackson.decorator;

public class Soy extends CondimentDecorator {
	
	public Soy (Beverage.Builder builder) {
		super(builder);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15d + super.cost();
	}
}
