package com.xworkz.corejava.objectClass.clone.deep_copy;

public class DeepCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address addr = new Address("Nr-Colony", "Banglore");
		User obj1 = new User("sharath",77,addr);
		
		User obj2 = (User)obj1.clone();
		System.out.println("Object 1" + obj1.toString());
		System.out.println("object 2" + obj2.toString());
		
		System.out.println("");
		System.out.println("Changing the name of city from B-lore to Hanumanth-nagar");
		System.out.println("");
		obj1.addr.city = "Hanumanth-Nagar";
		System.out.println("Object 1" + obj1.toString());
		System.out.println("object 2" + obj2.toString());
		
	}
}
