package com.xworkz.corejava.array_as_dao;

import com.xworkz.corejava.array_as_dao.dto.StudentDTO;
import com.xworkz.corejava.array_as_dao.services.StudentService;
import com.xworkz.corejava.array_as_dao.services.StudentServiceImpl;

public class ArrayApplication {

	public static void main(String[] args) {
		
		StudentDTO dto = new StudentDTO("1","Darshan","BTM01",8904121036l,"70%");
	    
		StudentService service = new StudentServiceImpl();
		
		//service.addStudent(dto);
		
					
	    StudentDTO student = service.getStudent(8904121036l);
	    System.out.println("Student Details :");
	    System.out.println(student);
	    student.setName("Darshan Gowda");
	    service.updateStudent(student);
	    service.deleteStudent(dto);
		
	}
}
   