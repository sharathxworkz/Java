package com.xworkz.bike.tvs;

public class EngineDetails {
	
	public static void main(String[] args) {
		
	Ronnie ronnie = new Ronnie();
	System.out.println("Here Are The Below Details OF Bike Ronnie..! ");
	System.out.println("");
	String ron = ronnie.getEnginePower();
	String rni = ronnie.getEngineType();
	int ronie = ronnie.getPrice();
	
	System.out.println("The Engine Power is :" + ron);
	System.out.println(" ");
	
	System.out.println("The Type Of Engine Provided in Ronnie is :" + rni);
	System.out.println(" ");
	
	System.out.println("The Price Of Ronnie is :"+" " + ronie + "rs");
	System.out.println(" ");
	
	System.out.print("The Main Heighlite Of The Bike is:");
	System.out.println("The Engine Power and Shifting of Gear is Completely Smooth.");
	
	}

}
