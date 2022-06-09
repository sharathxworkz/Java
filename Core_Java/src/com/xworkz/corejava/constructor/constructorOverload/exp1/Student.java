package com.xworkz.corejava.constructor.constructorOverload.exp1;

public class Student {
	
	int usn;
	String name;
	int age;
	long yoj;

	Student(int id, String n, int a){
		
		usn=id;
		name =n;
		age=a;
	}
	void print() {
		System.out.println("Details are as mentioned:"+usn+" "+name+" "+age);
	}
	Student(int uid,String un,int ag,long yj){
		usn=uid;
		name=un;
		age=ag;
		yoj=yj;
	}
	void display() {
		System.out.println("Details are as mentioned:"+usn+" "+name+" "+age+" "+yoj);
	}
}


