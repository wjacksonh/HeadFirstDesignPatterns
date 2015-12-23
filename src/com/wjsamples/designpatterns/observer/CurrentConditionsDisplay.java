package com.wjsamples.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Observable mObservable;
	private float      mTempreture;
	private float      mHumidity;
	private float      mPressure;
	
	public CurrentConditionsDisplay (Observable o) {
		mObservable = o;
		mObservable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current Conditions: " + 
								mTempreture + "F degrees and " +
								mHumidity   + "% humidity " + 
								mPressure   + " atmospheres");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			 mTempreture = weatherData.getTemprature();
			 mHumidity = weatherData.getHumidity();
			 mPressure = weatherData.getPressure();
			 display ();
		}
	}
}
