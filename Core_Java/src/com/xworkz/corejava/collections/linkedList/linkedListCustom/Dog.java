package com.xworkz.corejava.collections.linkedList.linkedListCustom;

public class Dog {
	
	private String breedName;
	private String color;
	private String weather;
	private double price;
	
	Dog(){
		
	}

	public String getBreedName() {
		return breedName;
	}

	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dog [breedName=" + breedName + ", color=" + color + ", weather=" + weather + ", price=" + price + "]";
	}

	
	
	

}
