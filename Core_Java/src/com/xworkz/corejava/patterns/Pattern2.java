package com.xworkz.corejava.patterns;

public class Pattern2
{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=4;i++){//used to print lines
		  for(j=1;j<=4;j++){//used to print * in a line
		      if(i==j)
			 System.out.print("*");
	         	else
		       System.out.print("O");	
		 }
		 j--;
		  System.out.print("*");
		 while(j>=1){//used to print * in a line
		     if(i==j)
		       System.out.print("*");
		     else
		       System.out.print("O");
		     j--;
		}
	      System.out.println("");
}
	}
}