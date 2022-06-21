package com.xworkz.corejava.Final_Keyword.Final_Through_Blocks;

public class FinalWithBlocks {

	final  int X;
	FinalWithBlocks(){
		System.out.println("This is a Default Constructor");
	}
	{
		this.X=17;
		System.out.println("Value of X is:" + X );
				
	}
	
}
