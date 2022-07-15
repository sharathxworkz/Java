package com.xworkz.corejava.exceptionHandling.custom_exception.checked_exception;

public class DivisionExceptionDemo {
	
	static int division(int a, int b){
	
		return a/b;
	}
	
   static int completeDivision(int a, int b) {
	    return division(a,b);
   }
	public static void main(String[] args) {
		
		DivisionExceptionDemo div = new DivisionExceptionDemo();
		try { 
		 int division = div.completeDivision(10, 0);
		
		 System.out.println(division);
		}
		catch (ArithmeticException e){
			
			e.printStackTrace();
		}
	}

}
