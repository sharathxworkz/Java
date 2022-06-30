package com.xworkz.corejava.objectClass.clone.deep_copy.car;

public class CarDeepCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		MusicSystem musicSystem = new MusicSystem("Boat","Bluetooth",50000);
		Car jagvar = new Car("Jaguar","Auto-Shifting","MatBlack",350000000.00,musicSystem);
		Car ferrari = jagvar.clone();
		
		System.out.println("Jaguar"+jagvar);
		System.out.println("Ferrari"+ferrari);
		//Before updated the changes
		
		System.out.println("");
		System.out.println("when we change the value of brand from Boat to Bose...!!!");
		System.out.println("MusicSystem:" + musicSystem);
		System.out.println("");
		
		jagvar.musicSystem.brand = "Bose";
		ferrari.price = 250000000;//changing price of the car
		musicSystem.brand = "Sony";//dought
		
		System.out.println("Jaguar"+jagvar);
		System.out.println("Ferrari"+ferrari);
		//After updating changes
	}

}
