package com.xworkz.corejava.exceptionHandling.custom_exception.unChecked.flipKart;

public class Products {

	void search(String product) {
		
		if(product.equals("MiA3")) {
			
			ProductException proExcp = new ProductException();
			throw proExcp;
		}
		else {
			System.out.println("These are the Results Found");
		}
	}
}
