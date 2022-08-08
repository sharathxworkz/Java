package com.xworkz.superBikes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static com.xworkz.superBikes.constants.DBConnection.*;

import com.xworkz.superBikes.dto.SuperBikeDTO;

public class SuperBikeDAOImpl implements SuperBike{

	@Override
	public Boolean saveDeatils(SuperBikeDTO bikedto) {
		try {
			Connection connection = DriverManager.getConnection(URL.getConnection(),USERNAME.getConnection(),SECRET.getConnection());
			String query = "insert into superbike_details values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, bikedto.getId());
			stmt.setString(2, bikedto.getCompanyName());
			stmt.setString(3,bikedto.getBikeType());
			stmt.setString(4,bikedto.getCubicCapacity());
			stmt.setInt(5,bikedto.getNoOfGears());
			stmt.setInt(6,bikedto.getTorque());
			stmt.setInt(7, bikedto.getRpm());
			stmt.setString(8, bikedto.getColor());
			stmt.setString(9,bikedto.getGearShiftingType());
			stmt.setInt(10, bikedto.getNoOfPersons());
			stmt.setString(11,bikedto.getHeadLampType());
			stmt.setDouble(12, bikedto.getPrice());
			Integer noOfRowsAffected = stmt.executeUpdate();
			if(noOfRowsAffected > 0) {
				System.out.println("The Rows Affected Are:" + noOfRowsAffected);
			}
			else {
				System.out.println("Unable To insert the Values");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SuperBikeDTO finfById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuperBikeDTO findByIdAndPresident(Integer id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuperBikeDTO findByIdAndPresidentAndName(Integer id, String name, String cubicCapacity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bikeNameByIdAndName(Integer id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
