package com.xworkz.corejava.constructor.constructorOverload.exp2;

public class TravellingPackage {
	
	String travels_name;
	int packagePrice;
	String destinationLocation;
	int days;
	int nop;
	String pickupPoint;

	
	TravellingPackage(){
		System.out.println("Sorry No booking's Available");
	}
	
	TravellingPackage(String tarv,int price,String dLocation,int nd,String pLocation){
		
		travels_name=tarv;
		packagePrice = price;
		destinationLocation = dLocation;
		days = nd;
		pickupPoint =pLocation;
	}
	
	
	void print() {

		System.out.println("The Package Details Are mentioned Below:-");
		System.out.println("Travels Name:-"+travels_name);
		System.out.println("Destination Location:-"+destinationLocation);
		System.out.println("Number Of Days:-"+days);
		System.out.println("Package Price:-"+packagePrice);
		System.out.println("Strarting Point:-"+pickupPoint);
	
	
	}
	
	
	TravellingPackage(String tarv,int price,String dLocation,int nd,int np,String pLocation){
		
		travels_name=tarv;
		packagePrice = price;
		destinationLocation = dLocation;
		days = nd;
		nop = np;
		pickupPoint =pLocation;
	}
	
	
	void display() {

		System.out.println("The Package Details Are mentioned Below:-");
		System.out.println("Travels Name:-"+travels_name);
		System.out.println("Destination Location:-"+destinationLocation);
		System.out.println("Number Of Days:-"+days);
		System.out.println("Package Price:-"+packagePrice);
		System.out.println("Number Of People in Trip:-"+nop);
		System.out.println("Strarting Point:-"+pickupPoint);
		
	
	}

}




