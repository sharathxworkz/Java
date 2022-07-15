package com.xworkz.corejava.exceptionHandling.custom_exception.unChecked.flipKart;

public class ProductException extends RuntimeException {

	@Override
	public String toString() {																																																																																																																																																																																																																					
		return " Item Out of Stock.";
	}

	
	public String notFoundException() {
		return "Item not found.";
	}
	
}
