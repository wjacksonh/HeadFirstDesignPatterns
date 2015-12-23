package com.wjsamples.designpatterns.composite;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS COMBINED", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
			
		/*
		 * Add diner menu items
		 */
		dinerMenu.add(new MenuItem("Pasta", 
								   "Spaghetti with marinarea sauce, and a slice of sourdough bread",
								   true,
								   3.89));
		
		dinerMenu.add(new MenuItem("Vegetarian BLT", 
				 				   "(Fakin') Bacon with lettuce & tomato on whole wheat",
								   true,
								   2.99));
		
		dinerMenu.add(new MenuItem ("BLT", 
								    "Bacon with lettuce & tomato on whole wheat",
									false,
									2.99));
		
		dinerMenu.add(new MenuItem ("Soup of the day", 
									"Soup of the day, with side potato salad",
									false,
									3.29));
		
		dinerMenu.add(new MenuItem ("Hotdog", 
				                    "A hot dog, with saurkraut, relish, onions, topped with cheese",
				                    false,
				                    3.05));
		
		dinerMenu.add(dessertMenu);

		/*
		 * Add breakfast menu Items
		 */		
		pancakeHouseMenu.add(new MenuItem ("K&B's Pancake Breakfast", 
				 "Pancakes with scrambled eggs, and toast",
				 true,
				 2.99));
		
		pancakeHouseMenu.add(new MenuItem ("Regular Pancake Breakfast", 
				 "Pancakes with fried eggs, and sausage",
				 false,
				 2.99));
		
		pancakeHouseMenu.add(new MenuItem ("Blueberry Pancakes", 
				 "Pancakes made with fresh blueberries",
				 true,
				 3.49));
		
		pancakeHouseMenu.add(new MenuItem ("Waffles", 
				 "Waffles with your choice of blueberries or strawberries",
				 true,
				 3.59));
		
		/*
		 * Add cafeMenu items
		 */		
		cafeMenu.add(new MenuItem ("Veggie Burger and Air Fries",
				 "Veggie Burger on a whole wheat bunm leeuce, tomato, and fries",
				 true,
				 3.99));
		
		cafeMenu.add(new MenuItem ("Soup of the day",
				 "A cup of Soup of the day and a side salad",
				 false,
				 3.69));
		
		cafeMenu.add(new MenuItem ("Burrito",
				 "A large burrito, with pinto beans, salsa, gaucamole",
				 false,
				 3.69));
		
		/*
		 * Add dessert menu items
		 */
		dessertMenu.add(new MenuItem ("Apple Pie",
				 "Apple pie with a flakey crust, topped with vanila Ice Cream",
				 true,
				 1.59));
		
		dessertMenu.add(new MenuItem ("Chocolate Cake",
				 "3 layer Chocolate cake with a chocolate frosting",
				 true,
				 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printVegetarianMenu();
	}
}
