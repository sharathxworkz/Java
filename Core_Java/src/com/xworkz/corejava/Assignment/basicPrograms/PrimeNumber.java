package com.xworkz.corejava.Assignment.basicPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 10;
		boolean flag = false;
	
		if(n % 2==0) {
			flag = true;
		}
		if(!flag) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("It is not a Prime Number");
		}
		
		
	}
}
