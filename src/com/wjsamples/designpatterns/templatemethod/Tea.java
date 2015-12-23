package com.wjsamples.designpatterns.templatemethod;

public class Tea extends CaffineBeverage{
	public void addCondiments () {
		System.out.println("Adding Lemon");
	}

	public void brew () {
		System.out.println("Steeping the Tea");			
	}
}
