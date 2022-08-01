package com.mysql.assignment.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.assignment.rolex.DBproperties;

public class JdbcRead {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBconnection.URL.getValue(), DBconnection.USERNAME.getValue(), DBconnection.PASSWORD.getValue());
		System.out.println(connection);

		String kf = "select * from kingfisher.kingFisherdetails";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(kf);
		boolean result = resultset.next();
		System.out.println(result);
		if(result) {
			
			int id = resultset.getInt("kid");
			System.out.println(id);
			String bName = resultset.getNString("brandName");
			System.out.println(bName);
			String kType = resultset.getString(3);
			System.out.println(kType);	
			Double price = resultset.getDouble("price");
			System.out.println(price);
		}
		else {
			System.out.println("Details Not Found in Table");
		}

}

}
