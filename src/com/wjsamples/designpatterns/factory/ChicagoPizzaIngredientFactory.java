package com.wjsamples.designpatterns.factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough ();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce ();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella ();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies [] = {new BlackOlives (), new Spinich (), new EggPlant ()};
		
		return veggies;
	}

	@Override
	public Peppereoni createPeppereoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams ();
	}
}
