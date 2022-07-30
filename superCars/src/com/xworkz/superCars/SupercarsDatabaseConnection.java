package com.xworkz.superCars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SupercarsDatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306", "root", "1JT14IS044shadow");
		System.out.println(connection);
	}

}
