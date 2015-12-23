package com.wjsamples.designpatterns.facade;

public class HomeTheaterFacade {
	Amplifier     mAmp;
	Tuner         mTuner;
	DvdPlayer     mDvd;
	CdPlayer      mCd;
	Projector     mProjector;
	TheaterLights mLights;
	Screen        mScreen;
	PopcornPopper mPopper;
	
	public HomeTheaterFacade (Amplifier     amp,
							  Tuner         tuner,
							  DvdPlayer     dvd,
							  CdPlayer      cd,
							  Projector     projector,
							  TheaterLights lights,
							  Screen        screen,
							  PopcornPopper popper) {
		mAmp = amp;
		mTuner = tuner;
		mDvd = dvd;
		mCd = cd;
		mProjector = projector;
		mLights = lights;
		mScreen = screen;
		mPopper = popper;
	}
	
	public void watchMovie (String movie) {
		System.out.println("Get ready to watch a movie...");
		mPopper.on();
		mPopper.pop();
		
		mLights.dim(10);
		
		mScreen.down();
		
		mProjector.on();
		mProjector.wideScreenMode();
		
		mAmp.on();
		mAmp.setDvd(mDvd);
		mAmp.setSurroundSound();
		mAmp.setVolume(5);
		
		mDvd.on();
		mDvd.play(movie);
	}
	
	public void endMovie () {
		System.out.println("Shutting moviie theater down...");
		mPopper.off();
		
		mLights.on();
		
		mScreen.up();
		
		mProjector.off();
		
		mAmp.off();
		
		mDvd.stop();
		mDvd.eject();
		mDvd.off();
	}
}
