package com.xworkz.corejava.Abstraction.Interfaces_Concept.TaxClculator;

public class TaxCalculator implements StateTax,CentralTax
{

	@Override
	public void petrolTax() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Tax is 10% of Total");
	}

	@Override
	public void electricityTax() {
		// TODO Auto-generated method stub
		System.out.println("Electricity Tax is 35% of power provided ");
		
	}

	
}
