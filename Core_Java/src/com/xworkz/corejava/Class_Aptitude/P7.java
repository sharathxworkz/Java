package com.xworkz.corejava.Class_Aptitude;

public class P7 {

	public static void main(String[] args) {

		int row = 6;
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=row-i; j>=1;j--) 
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	

}
