package com.xworkz.corejava.collections.treeSet;

import java.util.TreeSet;

public class TreeSetStringBuffer {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyComparator());
		
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("C"));
		ts.add(new StringBuffer("D"));
		ts.add(new StringBuffer("E"));
		
		System.out.println(ts);
		
	}

}
