package com.xworkz.corejava.objectClass.clone.deep_copy.car;

public class CarDeepCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		MusicSystem musicSystem = new MusicSystem("Boat","Bluetooth",50000);
		Car jagvar = new Car("Jaguar","Auto-Shifting","MatBlack",350000000.00,musicSystem);
		Car jagvar1 = jagvar.clone();
		
		System.out.println("Jaguar"+jagvar);
		System.out.println("Ferrari"+jagvar1);
		//Before updated the changes
		
		System.out.println("");
		System.out.println("when we change the value of brand from Boat to Bose...!!!");
		System.out.println("MusicSystem:" + musicSystem);
		System.out.println("");
		
		jagvar1.musicSystem.brand = "Bose";
		
		System.out.println("Jaguar"+jagvar);
		System.out.println("jagvar1"+jagvar1);
		//After updating changes
	}

}
