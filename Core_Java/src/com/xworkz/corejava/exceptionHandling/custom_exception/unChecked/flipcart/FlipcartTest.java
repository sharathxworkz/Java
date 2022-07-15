package com.xworkz.corejava.exceptionHandling.custom_exception.unChecked.flipcart;

public class FlipcartTest {

	public static void main(String[] args) {


		Product pedigree = new Product("pedigree", 7000.00);
		Product lakme = new Product("LakmeCream",500.50);
		Product soap = new Product("soap",30.00);
		Product shampoo = new Product("shampoo",50.00);
		Product bicycle = new Product("Bicycle",5000.00);
		
		Flipcart flipcart = new Flipcart();

		flipcart.addProduct(pedigree);
		flipcart.addProduct(lakme);
		flipcart.addProduct(soap);
		flipcart.addProduct(shampoo);
		flipcart.addProduct(bicycle);
		
		try {
            Product product=flipcart.getProduct(cycle);
			System.out.println(product);
			}
		catch(ProductException e) {
			System.err.println(e.getMessage());
		}
	}
}
