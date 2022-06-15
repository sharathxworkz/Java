package com.xworkz.corejava.type_Casting.non_Primitive_TypeCasting.bird;

public class BpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Peacock();
		Peacock peacock = (Peacock)bird;
		//bird.print();dought
		peacock.print();
	}

}
