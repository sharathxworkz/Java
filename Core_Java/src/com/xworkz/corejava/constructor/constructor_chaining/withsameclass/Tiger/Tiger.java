package com.xworkz.corejava.constructor.constructor_chaining.withsameclass.Tiger;

public class Tiger {

	String name;
	String color;
	String gender;
	
	Tiger(){
		this("Leo","White","Female");
	}
	
	Tiger(String name, String clr){
		this.name = name;
		this.color = clr;
		System.out.println("Hello Tiger had dinner..!");
	}
	
	Tiger(String name, String clr, String gender){
		this("Rio","Orange");//call to Tiger(String name, String clr)
		this.name=name;
		this.color=clr;
		this.gender = gender;
		System.out.println("If not come here I will give Sharan as Food..!!");
	}
}
