package com.wjsamples.designpatterns.factory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory mIngredientFactory;
	
	public ClamPizza (PizzaIngredientFactory ingredientFactory) {
		this.mIngredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + mName);
		mDough = mIngredientFactory.createDough();
		mSauce = mIngredientFactory.createSauce();
		mCheese = mIngredientFactory.createCheese();
		mClams = mIngredientFactory.createClams();
	}
}
