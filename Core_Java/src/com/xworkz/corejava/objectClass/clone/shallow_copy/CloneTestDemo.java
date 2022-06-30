package com.xworkz.corejava.objectClass.clone.shallow_copy;

public class CloneTestDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Soap dettol = new Soap("Detol",30,"Blue","Cool");
		Soap lifeBoy = null;
		lifeBoy = dettol.clone();
		
		System.out.println(dettol.equals(lifeBoy));
		System.out.println("Dettol:" +dettol);
		System.out.println("LifeBoy:"+lifeBoy);
		
	}

}
