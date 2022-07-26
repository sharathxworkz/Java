package com.xworkz.corejava.collections.treeSet.assignment.string;

import java.util.TreeSet;

public class StringCompareDemo {

	public static void main(String[] args) {
		
		TreeSet<String> animals = new TreeSet<String>(new CustomComparable());
		
		animals.add("Dog");
		animals.add("Zebra");
		animals.add("Cat");
		animals.add("Horse");
		animals.add("Dinosaur");
		
		System.out.println("TreeSet: " + animals);
	}
}
