package com.mysql.assignment.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRead2 {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBproperties.URL.getValue(), DBproperties.USERNAME.getValue(), DBproperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "select * from rolex_details where materialType ='Chain'";
		
		Statement statement = connection.createStatement();
		ResultSet resultset =statement.executeQuery(sql);
		boolean result = resultset.next();
		System.out.println(result);
		if(result) {
			
			int rid = resultset.getInt("rid");
			System.out.println(rid);
			String cName = resultset.getNString("brandName");
			System.out.println(cName);
			String mDesign = resultset.getString(3);
			System.out.println(mDesign);	
		}
		else {
			System.out.println("Details Not Found in Table");
		}
		
		
	}

}
