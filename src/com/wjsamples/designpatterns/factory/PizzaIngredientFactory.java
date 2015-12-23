package com.wjsamples.designpatterns.factory;

public interface PizzaIngredientFactory {
	public Dough createDough ();
	public Sauce createSauce ();
	public Cheese createCheese ();
	public Veggies[] createVeggies ();
	public Peppereoni createPeppereoni ();
	public Clams createClams ();
}
