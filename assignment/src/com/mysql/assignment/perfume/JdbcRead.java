package com.mysql.assignment.perfume;

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

		String get = "select * from perfume2.company_info where perfumeType ='Perfume'";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(get);
		boolean result = resultset.next();
		System.out.println(result);
		if(result) {
			
			int id = resultset.getInt("pid");
			System.out.println(id);
			String name = resultset.getNString("brandName");
			System.out.println(name);
			String type = resultset.getString(3);
			System.out.println(type);	
		}
		else {
			System.out.println("Details Not Found in Table");
		}
		
		
	}

}
