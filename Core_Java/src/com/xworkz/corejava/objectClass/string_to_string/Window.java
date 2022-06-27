package com.xworkz.corejava.objectClass.string_to_string;

public class Window {
	
	String type;
	double height;
	double width;
	String material;

	Window(String type,double height,double width,String material){
		this.type = type;
		this.height = height;
		this.width = width;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Window [type=" + type + ", height=" + height + ", width=" + width + ", material=" + material + "]";
	}	
	
	
	
}
