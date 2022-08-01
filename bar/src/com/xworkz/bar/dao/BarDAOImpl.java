package com.xworkz.bar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.xworkz.bar.constant.DbCredentials.*;
import com.xworkz.bar.dto.BarDTO;

public class BarDAOImpl implements BarDAO {

	@Override
	public boolean save(BarDTO barDTO) {

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query = "insert into bar.bar_info values (" + barDTO.getId() + ",'" + barDTO.getBarName() + "','"
					+ barDTO.getLocation() + "','" + barDTO.getType().getBar()
					+barDTO.getLocation()+ "',"+barDTO.getAvrCollectionPerDay()+","+barDTO.getAvrCollectionPerMonth()+")";
			Statement statement = connection.createStatement();
			Integer noOfRowsAffected = statement.executeUpdate(query);
			if (noOfRowsAffected > 0) {

				System.out.println("The Save Data is: " + query);
				System.out.println(noOfRowsAffected);
				return true;
			} else {
				System.out.println("The Data Was not added");
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;

	}

}
