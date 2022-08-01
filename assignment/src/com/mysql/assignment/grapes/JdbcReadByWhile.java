package com.mysql.assignment.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcReadByWhile {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBdetails.URL.getValue(), DBdetails.USERNAME.getValue(), DBdetails.PASSWORD.getValue());
		System.out.println(connection);

		String gQuery = "select * from grapes.grapes_details where price = 100";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(gQuery);
		
		
		
		AtomicInteger count = new AtomicInteger(0);
		while(resultset.next()) {	
			count.incrementAndGet();	
			int id  = resultset.getInt(1);
			String gname = resultset.getString(2);
			String gType = resultset.getString(3);
			String gColor = resultset.getString(4);
			Double gPrice = resultset.getDouble(5);
			
			System.out.println("The Details Are :" + id + " "+ gname + " " + gType + " " + gColor + " " + gPrice);
			
		}
		System.out.println(count);
		 
	}


}
