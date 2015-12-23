package com.wjsamples.designpatterns.factory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory mIngredientFactory;
	
	public VeggiePizza (PizzaIngredientFactory ingredientFactory) {
		this.mIngredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + mName);
		mDough = mIngredientFactory.createDough();
		mSauce = mIngredientFactory.createSauce();
		mCheese = mIngredientFactory.createCheese();
		mVegies = mIngredientFactory.createVeggies();
	}
}
