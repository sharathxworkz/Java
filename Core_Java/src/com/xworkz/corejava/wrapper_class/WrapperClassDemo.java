package com.xworkz.corejava.wrapper_class;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//implicit boxing
		
		int a = 10;
		Integer i = a;
		System.out.println("a :" + a);
		System.out.println("i :" + i);
		
		//explicit boxing
		
		int b = 20;
		Integer c = new Integer(b);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
		
		//implicit unboxing
		
		Integer  d = new Integer(777);
		int e = d;
		System.out.println("d :" + d);
		System.out.println("e :" + e);
		
		//explicit unboxing
		
		Integer f = new Integer(100);
		int l = f.intValue();
		System.out.println("F :" + f);
		System.out.println("L :" + l);
	}
}
