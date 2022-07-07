package com.xworkz.corejava.array_as_dao.services;

import com.xworkz.corejava.array_as_dao.dto.StudentDTO;

public interface StudentService {
	
	void addStudent(StudentDTO  dto);
	StudentDTO getStudent(long phno);
	void updateStudent(StudentDTO dto);
}
