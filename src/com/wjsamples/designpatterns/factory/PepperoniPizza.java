package com.wjsamples.designpatterns.factory;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory mIngredientFactory;
	
	public PepperoniPizza (PizzaIngredientFactory ingredientFactory) {
		this.mIngredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + mName);
		mDough = mIngredientFactory.createDough();
		mSauce = mIngredientFactory.createSauce();
		mCheese = mIngredientFactory.createCheese();
		mPepperoni = mIngredientFactory.createPeppereoni();
	}
}
