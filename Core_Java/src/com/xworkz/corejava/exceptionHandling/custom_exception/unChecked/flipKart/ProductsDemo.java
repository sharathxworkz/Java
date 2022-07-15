package com.xworkz.corejava.exceptionHandling.custom_exception.unChecked.flipKart;

public class ProductsDemo {

	public static void main(String[] args) {
	
		Products product = new Products();
		String product1 = "MiA3";
		
	try {
			product.search(product1);
		}
	    catch (ProductException e) {
	    		if(product1 == "MiA3") {
	    			e.printStackTrace();
	    		}
	    		
	    		else {
	    			System.out.println(e.notFoundException());
	    		}
		}
	}
		
}