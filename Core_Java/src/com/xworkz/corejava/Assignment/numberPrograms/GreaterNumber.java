package com.xworkz.corejava.Assignment.numberPrograms;

import java.util.Scanner;
public class GreaterNumber {
//using Ternary operator
	
	public static void main(String[] args)   
	{  
		int a, b, c, largest;   
		Scanner scn = new Scanner(System.in);  
		
		System.out.println("Enter the first number:");  
		a = scn.nextInt();  
		System.out.println("Enter the second number:");  
		b = scn.nextInt();  
		System.out.println("Enter the third number:");  
		c = scn.nextInt();  
		largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
		System.out.println("The largest number is: "+largest);  
	}  
} 
//have dought