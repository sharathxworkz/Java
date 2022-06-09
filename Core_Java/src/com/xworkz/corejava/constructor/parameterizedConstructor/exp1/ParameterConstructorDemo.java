package com.xworkz.corejava.constructor.parameterizedConstructor.exp1;

public class ParameterConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gun gun = new Gun(7,15.7,"MattBlack");
		Gun gun1 = new Gun(77, 125.59,"Dark_Grey");
		System.out.println("Gun Details:-");
		System.out.println("Size of Gun Bullet Catridge is: " + gun.nob);
		System.out.println("Weight of Gun is: " + gun.weight);
		System.out.println("Color of The Gun is: "+gun.color);
		System.out.println(" ");
		System.out.println("Gun Details:-");
		System.out.println("Size of Gun Bullet Catridge is: " + gun1.nob);
		System.out.println("Weight of Gun is: " + gun1.weight);
		System.out.println("Color of The Gun is: "+gun1.color);
	}

}
