package com.mysql.assignment.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/grapes", "root", "1JT14IS044shadow");
		System.out.println(connection);
		
		String update = "update grapes_details set price = 80 where gName = 'Sultana'";
		
		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(update);
			
		System.out.println(rowAffected);

	}

}
