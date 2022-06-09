package com.xworkz.corejava.patterns;

public class Pattern6 {
	public static void main(String args[]) {
//ASCII charted values is used
		
	for(int i=0;i<=5;i++) // for other ASCII value change a value "i"
	{
	  for(int j=0;j<=i;j++)
	   {
		  System.out.print(""+(char)(65+i));
		}
		System.out.println("");
	}
   }
		
}
