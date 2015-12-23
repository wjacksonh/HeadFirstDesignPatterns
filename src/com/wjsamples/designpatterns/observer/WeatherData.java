package com.wjsamples.designpatterns.observer;

import java.util.Observable;

public class WeatherData extends Observable {
	private float                mTemprature;
	private float                mHumidity;
	private float                mPressure;
	
	public WeatherData () {}
	
	public float getTemprature() {
		return mTemprature;
	}

	public float getHumidity() {
		return mHumidity;
	}

	public float getPressure() {
		return mPressure;
	}
	
	public void measurementsChanged () {
		setChanged();
		notifyObservers ();
	}
	
	public void setMeasurements (float temp, float humidity, float pressure) {
		mTemprature = temp;
		mHumidity = humidity;
		mPressure = pressure;
		
		measurementsChanged ();
	}
}
