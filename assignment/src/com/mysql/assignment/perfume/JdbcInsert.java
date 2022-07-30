package com.mysql.assignment.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/perfume2", "root", "1JT14IS044shadow");
		System.out.println(connection);
		
		String ks = "insert into company_info values (1,'KS','Perfume','Trance',154.00)";
		String park = "insert into company_info values (2,'Park-Avenue','Perfume','Trance',154.00)";
		String foog = "insert into company_info values (3,'Fogg','Deo','Mango',180.00)";
		String wild = "insert into company_info values (4,'WildStone','Perfume','Regal',230.00)";
		String xs = "insert into company_info values (5,'XS','Perfume','Fance',200.00)";
		String real = "insert into company_info values (6,'RealMen','Deo','Chocolate',280.00)";
		String nivea = "insert into company_info values (7,'Nivea','Deo','Menthol',230.00)";
		String goorej = "insert into company_info values (8,'Goorej','Perfume','Mango',254.00)";
		String denver = "insert into company_info values (9,'Denver','Perfume','Magnifico',300.00)";
		String layer = "insert into company_info values (10,'Layer-Short','Perfume','classic',120.00)";
		
		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(ks);
		int rowAffected1 = statement.executeUpdate(park);
		int rowAffected2 = statement.executeUpdate(foog);
		int rowAffected3 = statement.executeUpdate(wild);
		int rowAffected4 = statement.executeUpdate(xs);
		int rowAffected5 = statement.executeUpdate(real);
		int rowAffected6 = statement.executeUpdate(nivea);
		int rowAffected7 = statement.executeUpdate(goorej);
		int rowAffected8 = statement.executeUpdate(denver);
		int rowAffected9 = statement.executeUpdate(layer);
		
		System.out.println(rowAffected1);
		System.out.println(rowAffected2);
		System.out.println(rowAffected3);
		System.out.println(rowAffected4);
		System.out.println(rowAffected5);
		System.out.println(rowAffected6);
		System.out.println(rowAffected7);
		System.out.println(rowAffected8);
		System.out.println(rowAffected9);
	}

}
