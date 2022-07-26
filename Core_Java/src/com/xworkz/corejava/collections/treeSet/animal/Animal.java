package com.xworkz.corejava.collections.treeSet.animal;

public class Animal{
	
	private Integer age;
	private String name;
	private String color;
	private double price;

	Animal(){
		
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Animal [age=" + age + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
}
