package com.xworkz.corejava.exceptionHandling.finalKeyword;

public class FinallyDemo {

	public static void main(String[] args) {
		
		String s = "Xworkz";
		s = null;
		try {
		System.out.println(s.length());
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally executed");
		}
	}

}
