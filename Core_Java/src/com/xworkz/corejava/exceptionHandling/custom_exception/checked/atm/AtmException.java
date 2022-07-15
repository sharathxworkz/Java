package com.xworkz.corejava.exceptionHandling.custom_exception.checked.atm;

public class AtmException extends Exception {

	@Override
	public String toString() {
		return " You have crossed Daily Limit.";
	}

	@Override
	public String getMessage() {
		return "Invalid Amount Entered.";
	}
	
		


}
