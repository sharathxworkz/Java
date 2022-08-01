package com.mysql.assignment.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcReadbyIf {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBdetails.URL.getValue(), DBdetails.USERNAME.getValue(), DBdetails.PASSWORD.getValue());
		System.out.println(connection);

		String gquery = "select * from grapes_details where price = 100";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(gquery);
		boolean result = resultset.next();
		System.out.println(result);
		if(result) {
			
			int gid = resultset.getInt("gid");
			System.out.println(gid);
			String name = resultset.getNString("gName");
			System.out.println(name);
			String color = resultset.getString(4);
			System.out.println(color);	
		}
		else {
			System.out.println("Details Not Found in Table");
		}
		
		
	}


}
