package com.xworkz.corejava.encapsulation;

public class DogTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Summers");
		dog.setBreed("Shibu_abu");
		dog.setColor("Golden-Brown");
		dog.setAge(17);
		dog.setPrice(50000.55);
		
		System.out.println("Name of the Dog is: "+dog.getName());
		System.out.println("Breed of the Dog is: "+dog.getBreed());
		System.out.println("Color of the Dog is: "+dog.getColor());
		System.out.println("Age of the Dog is: "+dog.getAge());
		System.out.println("Price of the Dog is: "+dog.getPrice());
		
		

		
		

	}

}
