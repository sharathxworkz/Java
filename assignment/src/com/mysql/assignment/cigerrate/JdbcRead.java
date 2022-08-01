package com.mysql.assignment.cigerrate;

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

		String sql = "select * from cigaratee.c_details where cType ='Electric'";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(sql);
		boolean result = resultset.next();
		System.out.println(result);
		if(result) {
			
			int cid = resultset.getInt("cid");
			System.out.println(cid);
			String cName = resultset.getNString("cName");
			System.out.println(cName);
			String type = resultset.getString(3);
			System.out.println(type);	
		}
		else {
			System.out.println("Details Not Found in Table");
		}	}

}
