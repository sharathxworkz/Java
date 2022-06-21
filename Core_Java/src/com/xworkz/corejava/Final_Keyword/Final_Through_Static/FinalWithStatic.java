package com.xworkz.corejava.Final_Keyword.Final_Through_Static;

public class FinalWithStatic {
	
	final int X;
	final static int Y;
	
	FinalWithStatic(){
		
		System.out.println("This is Default constructor calling");
	}
	{
		this.X=27;
	}
	static {
		Y = 87;
	}
	
	

}
