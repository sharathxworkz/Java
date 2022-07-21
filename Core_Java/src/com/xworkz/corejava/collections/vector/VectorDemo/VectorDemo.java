package com.xworkz.corejava.collections.vector.VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Character> vector= new<Character> Vector(); 
		
		vector.addElement('A');
		vector.addElement('B');
		vector.addElement('S');
		vector.add('M');
		vector.add(4, 'M');
		System.out.println(vector);
		
		vector.insertElementAt('S', 5);// can't insert randomly
		System.out.println(vector);
		
		int count = 0;
		Enumeration<Character> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			enumeration.nextElement();
			count++;
		}
			System.out.println("The Number of elements in Vector are: " + count);
		}
		
	}
