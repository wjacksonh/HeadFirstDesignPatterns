package com.wjsamples.designpatterns.observer;

import java.util.Vector;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private Observable     mObservable;
	private Vector <Float> mTempretures;
	private float          mMin;
	private float          mMax;
	private float          mAvg;
	
	
	
	public StatisticsDisplay (Observable o) {
		mObservable = o;
		mObservable.addObserver (this);
		
		mTempretures = new Vector<Float>();
	}
	
	@Override
	public void display() {
		System.out.println("Weather Stats: Avg/Min/Max " + mAvg + "/" + mMin + "/" + mMax);
	}

	private void calculateStats() {
		mAvg = 0;
		mMin = Integer.MAX_VALUE;
		mMax = Integer.MIN_VALUE;
		
		float accumulator = 0;
		
		int len = mTempretures.size();
		for (int i = 0; i < len; i++) {
			Float f  = mTempretures.get(i);
			float fv = f.floatValue();
			accumulator += fv;
			
			mMin = Math.min(fv, mMin);
			mMax = Math.max(fv, mMax);
		}
		mAvg = accumulator / len;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			 mTempretures.add(weatherData.getTemprature());
			 calculateStats ();
			 
			 display ();
		}
		
	}
}
