package com.xworkz.corejava.Polymorphizm.MethodOverride.Dog;

public class DogDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		Husky h = new Husky();
		GoldenRetriver gr = new GoldenRetriver();
		
		d.price();
		h.price();
		gr.price();
	}

}
