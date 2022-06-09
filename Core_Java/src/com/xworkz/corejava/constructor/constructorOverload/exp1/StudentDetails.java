package com.xworkz.corejava.constructor.constructorOverload.exp1;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student(777147,"Shadow",25);
		Student stu1 = new Student(777,"Shrath",25,2020);
		stu.print();
		stu1.display();
	}

}
