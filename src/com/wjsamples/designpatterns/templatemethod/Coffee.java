package com.wjsamples.designpatterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffineBeverage {
	public void addCondiments () {
		System.out.println("Adding Sugar and Milk");
	}

	public void brew() {
		System.out.println("Dripping Coffee through filter");			
	}

	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput () {
		String answer = null;
		System.out.println("Would you like some milk and sugar with your coffee (y/n)? ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = reader.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error tryig too read your answer");
		}
		
		if (answer == null) {
			answer = "n";
		}
		
		return answer;
	}
}
