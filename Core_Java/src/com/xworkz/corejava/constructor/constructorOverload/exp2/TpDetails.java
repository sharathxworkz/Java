package com.xworkz.corejava.constructor.constructorOverload.exp2;

public class TpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TravellingPackage tp = new TravellingPackage("Manish Travels",50000,"North_Tour",7,57,"Vidyapeeta!!");
		TravellingPackage tp1 = new TravellingPackage("Maruthi Travels",25000,"KanyaKumari",37,"Majestic");

		tp.display();
		System.out.println("");
		tp1.print();
		System.out.println("");
		TravellingPackage tp2 = new TravellingPackage();
	}

}
