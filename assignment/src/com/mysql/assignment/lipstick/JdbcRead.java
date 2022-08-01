package com.mysql.assignment.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.assignment.rolex.DBproperties;

public class JdbcRead {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBproperties.URL.getValue(), DBproperties.USERNAME.getValue(), DBproperties.PASSWORD.getValue());
		System.out.println(connection);

		String fetch = "select * from lipstick.lipstick_details where lType = 'Glossy'";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(fetch);
		boolean result = resultset.next();
		System.out.println(result);
		if(result) {
			
			int lid = resultset.getInt("lid");
			System.out.println(lid);
			String lName = resultset.getNString("brandName");
			System.out.println(lName);
			String type = resultset.getString(3);
			System.out.println(type);	
		}
		else {
			System.out.println("Details Not Found in Table");
		}
		
		
	}

}
