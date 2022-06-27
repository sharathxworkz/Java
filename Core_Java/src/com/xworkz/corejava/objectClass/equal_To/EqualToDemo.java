package com.xworkz.corejava.objectClass.equal_To;

public class EqualToDemo {

	public static void main(String[] args) {
		
		Ac lg = new Ac("LG",5,35000.50,"Black");
		Ac lg1 = new Ac("LG",5,35000.50,"Black");
		Ac samsung = new Ac("Samsung",5,36000.500,"Blue");
		System.out.println(lg.equals(lg1));
	}

}
