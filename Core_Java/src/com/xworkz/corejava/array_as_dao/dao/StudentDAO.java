package com.xworkz.corejava.array_as_dao.dao;
import com.xworkz.corejava.array_as_dao.dto.StudentDTO;

public interface StudentDAO {

	void addStudent(StudentDTO dto);
	StudentDTO getStudent(long phno);
	void updateStudent(StudentDTO dto);
	void deleteStudent(StudentDTO dto);
	//void updateStudent(long phno, String batchhName);
}
