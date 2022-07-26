package com.xworkz.corejava.collections.treeSet;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		StringBuffer sb1 = (StringBuffer)o1;
		StringBuffer sb2 = (StringBuffer)o2;
		
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
		
	}


}
