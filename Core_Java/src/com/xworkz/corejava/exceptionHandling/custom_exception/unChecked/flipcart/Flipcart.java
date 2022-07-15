package com.xworkz.corejava.exceptionHandling.custom_exception.unChecked.flipcart;

public class Flipcart {

	Product products[] = new Product[10];
	
	void addProduct(Product product) {
		for(int i = 0; i<products.length; i++) {
			if(products[i] == null) {
				products[i] = product;
				System.out.println("The added Product is: " + products[i]);
				break;
			}
		} 
	}
	

	public Product getProduct(Product product) {
		Product product1 = null;
		for(int i = 0; i<products.length; i++) {
			if(products[i] != null && products[i].getProduct().equals(product.getProduct())){
				product1 = products[i];
			}
		}
       
		if(product1 != null) {
			return product1;
		}
		
		else {
			ProductException pe = new ProductException();
			throw pe;
		}
	}
}
