package com.mysql.assignment.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.mysql.assignment.rolex.DBproperties;

public class JdbcReapOperationWh {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBconnection.URL.getValue(), DBconnection.USERNAME.getValue(), DBconnection.PASSWORD.getValue());
		System.out.println(connection);

		String query = "select * from kingfisher.kingfisherdetails";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(query);
		
		
		
		AtomicInteger count = new AtomicInteger(0);
		while(resultset.next()) {	
			count.incrementAndGet();	
			int kid  = resultset.getInt(1);
			String bname = resultset.getString(2);
			String type = resultset.getString(3);
			String color = resultset.getNString("color");
			Double price = resultset.getDouble(4);
			
			System.out.println("The Details Are :" + kid + " "+ bname + " " + type + " " + color + " " + price);
			
		}
		System.out.println(count);
		 
	}


}
