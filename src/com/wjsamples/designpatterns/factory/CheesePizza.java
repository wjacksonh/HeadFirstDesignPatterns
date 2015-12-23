package com.wjsamples.designpatterns.factory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory mIngredientFactory;
	
	public CheesePizza (PizzaIngredientFactory ingredientFactory) {
		this.mIngredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + mName);
		mDough = mIngredientFactory.createDough();
		mSauce = mIngredientFactory.createSauce();
		mCheese = mIngredientFactory.createCheese();
	}
}
