package com.xworkz.corejava.array_as_dao.dao;

import com.xworkz.corejava.array_as_dao.dto.StudentDTO;
public class StudentDAOImpl implements StudentDAO {

	StudentDTO[] students = new StudentDTO[10];

	int index = 0;

	@Override
	public void addStudent(StudentDTO dto) {
		this.students[this.index] = dto;
		this.index++;
	}

	@Override
	public StudentDTO getStudent(long phno) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getPhno() == phno) {
				//System.out.println(students[i]); // unnessecary sop
				return students[i];
			}

		}
		return null;

	}

	@Override
	public void updateStudent(StudentDTO dto) {
			int count = 0;
			for (int i=0; i< students.length; i++) {
				if(students[i] != null && students[i].getPhno() == dto.getPhno()) {
					count++;
					students[i].setId(dto.getId());
					students[i].setName(dto.getName());
					students[i].setBatchname(dto.getBatchname());
					students[i].setPercentage(dto.getPercentage());
					
				}
			}
			if(count == 0) {
				System.out.println("student not found");
			}
				
	}

	@Override
	public void deleteStudent(StudentDTO dto) {
		int count = 0;
		for (int i=0; i< students.length; i++) {
			if( students[i] != null && students[i].getName() == dto.getName()) {
				for(int j=i; j<students.length-1;j++) {
					students[j] = students[j+1];
					count++;
				}
				 break;
			}
		}	
		if(count > 0) {
			System.out.println("Student: phone Number " +dto.getName() +" " + dto.getPhno() + " deleted from the array" );
		}
		
		else {
			System.out.println("Invalid Details");
		}
		
	}
	
	
}	

	

	

