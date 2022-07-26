package com.xworkz.corejava.collections.treeSet.student;

public class Student implements Comparable<Student>{
	
	private Integer id;
	private String studentName;
	
	public Student(){
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public int compareTo(Student student) {
		return student.studentName.compareTo(this.studentName);
//		if(this.id < student.id)
//		return -1;
//		
//		else if(this.id > student.id)
//		return +1;
//		
//		else
//			return 0;
	}

	
}
