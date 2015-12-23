package com.wjsamples.designpatterns.templatemethod;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck [] ducks = {
				new Duck("Daffy",  8),
				new Duck("Dewey",  2),
				new Duck("Howard", 7),
				new Duck("Louie",  2),
				new Duck("Donald", 10),
				new Duck("Huey",   2)
		};
		
		System.out.println("Before Sorting: ");
		displayDucks (ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("\nAfter Sorting: ");
		displayDucks (ducks);
	}

	private static void displayDucks(Duck[] ducks) {
		for (Duck d : ducks) {
			System.out.println(d);
		}
	}

}
