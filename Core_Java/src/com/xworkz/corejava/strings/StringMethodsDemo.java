package com.xworkz.corejava.strings;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String name = "nandish";
		String upperCaseName = name.toUpperCase();
		
		System.out.println("Name is :" + name + " " +upperCaseName);
		
		String sirname = "channal";
		
		String concatinate = name.concat(sirname);
		System.out.println("Name is :" + concatinate);
	 
		System.out.println("char at 1 in name :" + name.charAt(3));
		System.out.println(concatinate.endsWith("al"));
		String[] splittedstr = concatinate.split(" ");
		System.out.println("words in name is : " + splittedstr.length);
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		 System.out.println(str1.matches(str2));
		 
		 String str = "Welcome to your world";
		 System.out.println(str.split(str, 5));
		
	}
}
