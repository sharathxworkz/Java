package com.mysql.assignment.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/lipstick", "root", "1JT14IS044shadow");
		System.out.println(connection);
		
		String update = "update lipstick_details set brandName = 'Loe' where price = 350.00";
		
		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(update);
			
		System.out.println(rowAffected);

	}

}
