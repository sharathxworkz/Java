package com.xworkz.corejava.Abstraction.Interfaces_Concept.OperatingSystem;

public class Linux implements MediaPlayer {

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Linux Uses Amarok software to play music..!!");
	}
	@Override
	public void playMovie() {
		// TODO Auto-generated method stub
		System.out.println("Linux"
				+ " Uses SMplayer software to play Movies and Song Vedious..!!");
	}

	
}
