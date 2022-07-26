package com.xworkz.corejava.collections.treeSet.student;

import java.util.TreeSet;

public class ComparableDemo{

	public static void main(String[] args) {
		
		TreeSet<Student> students = new TreeSet<Student>();
		
		Student dev = new Student();
		dev.setId(1);
		dev.setStudentName("Dev");
		
		Student vicky = new Student();
		vicky.setId(2);
		vicky.setStudentName("Vicky");
		
		Student summer = new Student();
		summer.setId(3);
		summer.setStudentName("Summers");
		
		Student winter = new Student();
		winter.setId(4);
		winter.setStudentName("Winter");
		
		students.add(dev);
		students.add(vicky);
		students.add(summer);
		students.add(winter);
		
		System.out.println(students);
		
		
		
	}



}
