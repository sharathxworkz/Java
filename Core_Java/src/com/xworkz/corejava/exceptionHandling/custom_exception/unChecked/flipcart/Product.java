package com.xworkz.corejava.exceptionHandling.custom_exception.unChecked.flipcart;

public class Product {

	private String productName;
	private double price;
	
	public Product(String productName,double price) {
		this.productName = productName;
		this.price =  price;
	}

	public String getProduct() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}
	
	
}
