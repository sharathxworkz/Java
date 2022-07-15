package com.xworkz.corejava.exceptionHandling.custom_exception.checked.atm;

public class AtmMachine {
	
	void draw(int amount) throws AtmException {
		if(amount < 100 || amount > 50000 || amount%100 != 0 ) {
			AtmException atmExp = new AtmException();
			throw atmExp;
		}
		
		else {
			
			System.out.println("Please Wait for the cash");
		}
	}

}
