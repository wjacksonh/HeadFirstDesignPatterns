package com.wjsamples.designpatterns.command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRooomLight = new Light ("Living Room");
		TV tv = new TV ("Living Room");
		Stereo stereo = new Stereo("Living Room");
		HotTub hotTub = new HotTub();
		
		LightOnCommand lightsOn = new LightOnCommand(livingRooomLight);
		StereoOnWithDVDCommand stereoOn = new StereoOnWithDVDCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HotTubOnCommand hotTubOn = new HotTubOnCommand(hotTub);
		
		LightOffCommand lightsOff = new LightOffCommand(livingRooomLight);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HotTubOffCommand hotTubOff = new HotTubOffCommand(hotTub);
		
		Command[] partyOn = {lightsOn, stereoOn, tvOn, hotTubOn};
		Command[] partyOff = {lightsOff, stereoOff, tvOff, hotTubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);


		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		System.out.println("--- Pushing  Macro On ---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing  Macro Off ---");
		remoteControl.offButtonWasPushed(0);
		System.out.println("--- Pushing  Undo ---");
		remoteControl.undoButtonPressed();
	}
}
