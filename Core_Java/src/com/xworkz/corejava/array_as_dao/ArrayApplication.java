package com.xworkz.corejava.array_as_dao;

import com.xworkz.corejava.array_as_dao.dto.StudentDTO;
import com.xworkz.corejava.array_as_dao.services.StudentService;
import com.xworkz.corejava.array_as_dao.services.StudentServiceImpl;

public class ArrayApplication {

	public static void main(String[] args) {
		
		StudentDTO dto = new StudentDTO("1","Darshan","BTM01",8904121036l,"70%");
		StudentDTO dto1 = new StudentDTO("2","Hanmanth","BTM02",9740884217l,"75%");
		StudentDTO dto2 = new StudentDTO("3","Baba","BTM03",9740884232l,"67%");
		StudentService service = new StudentServiceImpl();
		
		service.addStudent(dto);
		service.addStudent(dto1);
		service.addStudent(dto2);
			
	    StudentDTO student = service.getStudent(8904121036l);
	   
	    System.out.println("Student Details :");
	    System.out.println(student);
		
	}
}
    
