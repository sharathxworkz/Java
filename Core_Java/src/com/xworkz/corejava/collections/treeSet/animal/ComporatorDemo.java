package com.xworkz.corejava.collections.treeSet.animal;

import java.util.TreeSet;

public class ComporatorDemo {

	public static void main(String[] args) {

		TreeSet treeset = new TreeSet(new SortNameComporater());
		
		Animal shidzu = new Animal();
		shidzu.setAge(2);
		shidzu.setName("Sidzu");
		shidzu.setColor("Brown");
		shidzu.setPrice(25000);
		
		Animal chow = new Animal();
		chow.setAge(1);
		chow.setName("Chow-Chow");
		chow.setColor("Brown");
		chow.setPrice(35000);
		
		Animal husky = new Animal();
		husky.setAge(5);
		husky.setName("Husky");
		husky.setColor("Brown");
		husky.setPrice(65000);
		
		treeset.add(shidzu);
		treeset.add(chow);
		treeset.add(husky);
		
		System.out.println(treeset);
		
		

	}

}
