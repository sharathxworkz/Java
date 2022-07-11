package com.xworkz.corejava.parsing;

public class ParsingDemo {

	public static void main(String[] args) {
		
		String s = "10";
		String s1 = "20";
		
		String s2 = s+s1;
		System.out.println(s2);

		Integer str = Integer.parseInt(s);
		Integer str1 = Integer.parseInt(s1);
		
		Integer str2 = str+str1;
		System.out.println(str2);
		
		//boolean value
		
		String h = "true";
		String g = "false";
		
		boolean b = Boolean.parseBoolean(h);
		boolean l = Boolean.parseBoolean(g);
		
		System.out.println(b);
		System.out.println(l);
		
		
		
		
		
		
	}

}
