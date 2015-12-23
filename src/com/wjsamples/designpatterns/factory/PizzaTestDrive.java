package com.wjsamples.designpatterns.factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());
		
		pizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName());
	}

}
