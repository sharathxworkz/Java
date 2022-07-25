package com.xworkz.corejava.collections.set.hashset.linkedHashSet;

public class Cars {

	private Integer modelNo;
	private String companyName;
	private String carName;
	private String color;
	private double price;
	
	public Cars(){
		
	}
	
	public Integer getModelNo() {
		return modelNo;
	}



	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getCarName() {
		return carName;
	}



	public void setCarName(String carName) {
		this.carName = carName;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Cars [modelNo=" + modelNo + ", companyName=" + companyName + ", carName=" + carName + ", color=" + color
				+ ", price=" + price + "]";
	}
	
	

}
