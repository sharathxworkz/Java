package com.xworkz.corejava.exceptionHandling.custom_exception.unChecked.flipcart;

public class ProductException extends RuntimeException{

	@Override
	public String toString() {
		return "Product not Found";
	}
}
