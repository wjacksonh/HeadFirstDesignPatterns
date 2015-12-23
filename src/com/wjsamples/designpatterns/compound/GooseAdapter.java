package com.wjsamples.designpatterns.compound;

public class GooseAdapter implements Quackable {

	Goose mGoose;
	public GooseAdapter (Goose goose) {
		mGoose = goose;
	}
	
	@Override
	public void quack() {
		mGoose.honk();
	}

}
