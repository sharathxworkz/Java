package com.xworkz.corejava.strings.sb_and_sb;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Xworkz");
		System.out.println("String :" + builder);
		builder.reverse();
		System.out.println("Reversed String :" + builder);
	}

}
