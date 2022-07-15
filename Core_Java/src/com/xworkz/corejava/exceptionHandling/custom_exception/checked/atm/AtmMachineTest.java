package com.xworkz.corejava.exceptionHandling.custom_exception.checked.atm;

public class AtmMachineTest {

	public static void main(String[] args) {
		AtmMachine atmMachine = new AtmMachine();
		int amount = 60000;
		try {
			  atmMachine.draw(amount);
		}
		catch(AtmException e) {
			if(amount >50000) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
		} 

	}

	

}
