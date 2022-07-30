package com.mysql.assignment.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/perfume2", "root", "1JT14IS044shadow");
		System.out.println(connection);
		
		String delete = "delete from company_info where price = 154";
		
		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(delete);
			
		System.out.println(rowAffected);
		
		

	}

}
