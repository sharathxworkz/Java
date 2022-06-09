package com.xworkz.corejava.Assignment.numberPrograms;

import java.util.Scanner; 
public class SumOfNaturalNumbers
{	  
	public static void main(String[] args)   
	{     
		int num,sum,i;
		sum=0;
		Scanner scn = new Scanner(System.in);  
		System.out.print("Sum from: ");  
		i = scn.nextInt();  
		System.out.print("Sum up to: ");  
		num = scn.nextInt();  
		while(i <= num)  
		{  
			sum = sum + i;  
			i++;  
		}  
		System.out.println("Sum of Natural Numbers = " + sum);  
	}  
}
