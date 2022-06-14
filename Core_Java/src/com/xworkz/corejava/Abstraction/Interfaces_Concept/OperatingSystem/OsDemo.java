package com.xworkz.corejava.Abstraction.Interfaces_Concept.OperatingSystem;

public class OsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystem operatingSystem = new OperatingSystem();
		Windows windows = new Windows();
		Linux linux = new Linux();
		operatingSystem.play(linux);
		operatingSystem.play(windows);
	}

}
