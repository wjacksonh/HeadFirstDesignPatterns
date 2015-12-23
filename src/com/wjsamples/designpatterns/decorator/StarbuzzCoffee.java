package com.wjsamples.designpatterns.decorator;

public class StarbuzzCoffee {
	
	public static void printBeverage (Beverage beverage) {
		System.out.format("%s $%.2f%n", beverage.getDescription(), beverage.cost());
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage.Builder esspresso = Beverage.Builder.create (new Espresso());
		
		printBeverage(esspresso.get());
		
		Beverage.Builder houseBlend = Beverage.Builder.create(new HouseBlend());
		printBeverage(houseBlend.add(new Mocha(houseBlend))
				                .add(new Mocha(houseBlend))
				                .add(new SteamedMilk(houseBlend))
				                .setSize(Size.GRANDE)
				                .add(new Soy(houseBlend))
				                .add(new Whiped(houseBlend)).get());
				
		Beverage.Builder decaf = Beverage.Builder.create(new Decaf());
		printBeverage(decaf.add(new Mocha(decaf))
				           .add(new Soy(decaf))
				           .add(new Whiped(decaf))
				           .setSize(Size.VENTI).get());
		
	}
}
