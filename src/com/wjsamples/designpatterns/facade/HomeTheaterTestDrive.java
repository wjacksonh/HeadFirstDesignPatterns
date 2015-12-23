package com.wjsamples.designpatterns.facade;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		DvdPlayer dvd = new DvdPlayer(amp);
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,
															  new Tuner(amp), 
															  dvd, 
															  new CdPlayer(amp),
															  new Projector(dvd),
															  new TheaterLights(),
															  new Screen(), 
															  new PopcornPopper());
		
		homeTheater.watchMovie("Raider of the Lost Ark");
		homeTheater.endMovie();
	}
}
