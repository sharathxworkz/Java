package com.xworkz.corejava.collections.linkedList.linkedListCustom;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList <Dog> dog = new LinkedList<Dog>();
		
		Dog husky = new Dog();
		husky.setBreedName("Husky");
		husky.setColor("Black");
		husky.setWeather("Cold-Weather");
		husky.setPrice(65000.00);
		
		Dog alaskanMalamute = new Dog();
		husky.setBreedName("AlaskanMalamute");
		husky.setColor("Brown");
		husky.setWeather("Cold-Weather");
		husky.setPrice(60000.00);
		
		Dog german = new Dog();
		husky.setBreedName("GermanSheperd");
		husky.setColor("Greay");
		husky.setWeather("Normal");
		husky.setPrice(20000.00);
		
		Dog shibuAbu = new Dog();
		husky.setBreedName("Shibu-Abu");
		husky.setColor("LightOrange");
		husky.setWeather("Normal-Weather");
		husky.setPrice(65000.00);
		
		
		dog.add(husky);		
		dog.add(alaskanMalamute);
		dog.add(german);
		dog.add(shibuAbu);
		
		for (Dog dog2 : dog) {
			System.out.println(dog2);
			
		}
	}
}
