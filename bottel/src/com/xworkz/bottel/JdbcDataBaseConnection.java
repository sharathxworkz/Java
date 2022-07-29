package com.xworkz.bottel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/perfume", "root", "1JT14IS044shadow");
		System.out.println(connection);
		
		String insert = "insert into company_info values (2,'WildStone','Perfume','Mint',300.00)";
		String update = "update company_info set companyName = 'WildStone' where price = 300";
		String delete = "delete from company_info where price = 200";
		
		Statement statement = connection.createStatement();
		int noRowsAffected =  statement.executeUpdate(delete);
		System.out.println(noRowsAffected);

	}

}