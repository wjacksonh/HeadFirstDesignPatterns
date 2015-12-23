package com.wjsamples.designpatterns.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light       livingRoomLight  = new Light("Living Room");
		Light       kitchenRoomLight = new Light("Kitchen Room");
		CeillingFan ceillingFan      = new CeillingFan("Living Room");
		//GarageDoor  garageDoor       = new GarageDoor ("");
		Stereo      stereo           = new Stereo("Living Room");

		LightOnCommand  livingRoomLightOn   = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff  = new LightOffCommand(livingRoomLight);
		LightOnCommand  kitchenRoomLightOn  = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
		
		CeillingFanHighCommand  ceillingFanOn   = new CeillingFanHighCommand(ceillingFan);
		CeillingFanOffCommand ceillingFanOff   = new CeillingFanOffCommand(ceillingFan);
		
		//GarageDoorUpCommand   garageDoorUp   = new GarageDoorUpCommand(garageDoor);
		//GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand      stereoOffCommand      = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, ceillingFanOn, ceillingFanOff);
		remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
		
		/*
		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		*/
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
	}
}
