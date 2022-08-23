package com.xworkz.corejava.constructor.constructor_chaining.withsameclass.Atletics;

public class Atletics {
	
	String name;
	int distance;
	String type; 

	Atletics (){
	this("Swimming", "Rellay", 400);
	System.out.println("The Name of game is: Athletics");

	}
	
	Atletics( String name, String type){
	this.name = "Athletics";
	this.type = "Relay";
	System.out.println("The type of game is:"+this.type);
	}

	Atletics( String name,String type,int distance){
	this("run","relay");
	this.name = name;
	this.type = type;
	this.distance = distance;
	System.out.println("The distance of the game is:"+this.distance+"mm");

	}

}
