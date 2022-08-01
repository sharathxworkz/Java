package com.mysql.assignment.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.mysql.assignment.rolex.DBproperties;

public class JdbcReadw {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBproperties.URL.getValue(), DBproperties.USERNAME.getValue(), DBproperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "select * from cigaratee.c_details";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(sql);
		
		AtomicInteger count = new AtomicInteger(0);
		while(resultset.next()) {	
			count.incrementAndGet();	
			int id  = resultset.getInt(1);
			String name = resultset.getString(2);
			String type = resultset.getString(3);
			Double price = resultset.getDouble(5);
			
			System.out.println("The Details Are :" + id + " "+ name + " " + type + " " + price);
			
		}
		System.out.println(count);
		 
	}


}
