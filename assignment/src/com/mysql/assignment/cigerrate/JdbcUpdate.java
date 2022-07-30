package com.mysql.assignment.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/cigaratee","root","1JT14IS044shadow");
		System.out.println(connection);
		
		String update = "update c_details set price = 27 where cName = 'David-Off'";
		
		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(update);
		
		System.out.println(rowAffected);

	}

}
