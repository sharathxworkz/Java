package com.xworkz.corejava.collections.treeSet.assignment.string;

import java.util.Comparator;

public class CustomComparable implements Comparator<String>{

	@Override
	public int compare(String animal1, String animal2) {
		String s1 = animal1.toString();
		String s2 = animal2.toString();
		
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if (l1 < l2) {
			return -1;
		}
		else if(l1 > l2){
			return 1;
		}
		else {
			return s1.compareTo(s2);
		}
	}

}

