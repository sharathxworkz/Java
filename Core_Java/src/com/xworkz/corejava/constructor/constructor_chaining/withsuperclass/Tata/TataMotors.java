package com.xworkz.corejava.constructor.constructor_chaining.withsuperclass.Tata;

public class TataMotors extends TataGroups {

	String model;
	String color;
	
	TataMotors(){
		super("TataRatan");
		System.out.println("Constructed TataMotor Object");
		this.color = "matblack";
		this.model = "RangeRover";
	}
}
