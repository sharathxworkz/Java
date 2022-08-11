package com.xworkz.superBikes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.xworkz.superBikes.constants.DBConnection.*;

import com.xworkz.superBikes.constants.BikeCC;
import com.xworkz.superBikes.constants.CompanyName;
import com.xworkz.superBikes.dto.SuperBikeDTO;

public class SuperBikeDAOImpl implements SuperBikeDAO{

	@Override
	public Boolean saveDeatils(SuperBikeDTO bikedto) {
		try(Connection connection = DriverManager.getConnection(URL.getConnection(),USERNAME.getConnection(),SECRET.getConnection());) {
			
			String query = "insert into superbike_details values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, bikedto.getId());
			stmt.setString(2, bikedto.getCompanyName().getName());
			stmt.setString(3,bikedto.getBikeType());
			stmt.setString(4,bikedto.getCubicCapacity().getCapacity());
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
				System.out.println("The Values Inserted Are:" + query);
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
		try(Connection connection = DriverManager.getConnection(URL.getConnection(),USERNAME.getConnection(),SECRET.getConnection());) {
			
			String query = "select * from superbikes.superbike_details where bid = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1,id);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()) {
				Integer bid = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String type = resultSet.getString(3);
				String capacity = resultSet.getString(4);
				Integer nGears = resultSet.getInt(5);
				Integer torque = resultSet.getInt(6);
				Integer rpm = resultSet.getInt(7);
				String color = resultSet.getString(8);
				String gType = resultSet.getString(9);
				Integer nPersons = resultSet.getInt(10);
				String headType = resultSet.getString(11);
				Double price = resultSet.getDouble(12);
				
				SuperBikeDTO bikeDTO = new SuperBikeDTO();
				
				bikeDTO.setId(bid);
				bikeDTO.setCompanyName(CompanyName.getByName(name));
				bikeDTO.setBikeType(type);
				bikeDTO.setCubicCapacity(BikeCC.getByCapacity(capacity));
				bikeDTO.setNoOfGears(nGears);
				bikeDTO.setTorque(torque);
				bikeDTO.setRpm(rpm);
				bikeDTO.setColor(color);
				bikeDTO.setGearShiftingType(gType);
				bikeDTO.setNoOfPersons(nPersons);
				bikeDTO.setHeadLampType(gType);
				bikeDTO.setPrice(price);
				return bikeDTO;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SuperBikeDTO findByIdAndName(Integer id, String name) {
		try(Connection connection = DriverManager.getConnection(URL.getConnection(),USERNAME.getConnection(),SECRET.getConnection());) {
			
			String query = "select * from superbikes.superbike_details where bid = ? and companyName = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1,id);
			stmt.setString(2, name);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()) {
				Integer bid = resultSet.getInt(1);
				String Cname = resultSet.getString(2);
				String type = resultSet.getString(3);
				String capacity = resultSet.getString(4);
				Integer nGears = resultSet.getInt(5);
				Integer torque = resultSet.getInt(6);
				Integer rpm = resultSet.getInt(7);
				String color = resultSet.getString(8);
				String gType = resultSet.getString(9);
				Integer nPersons = resultSet.getInt(10);
				String headType = resultSet.getString(11);
				Double price = resultSet.getDouble(12);
				
				SuperBikeDTO bikeDTO = new SuperBikeDTO();
				
				bikeDTO.setId(bid);
				bikeDTO.setCompanyName(CompanyName.getByName(Cname));
				bikeDTO.setBikeType(type);
				bikeDTO.setCubicCapacity(BikeCC.getByCapacity(capacity));
				bikeDTO.setNoOfGears(nGears);
				bikeDTO.setTorque(torque);
				bikeDTO.setRpm(rpm);
				bikeDTO.setColor(color);
				bikeDTO.setGearShiftingType(gType);
				bikeDTO.setNoOfPersons(nPersons);
				bikeDTO.setHeadLampType(gType);
				bikeDTO.setPrice(price);
				return bikeDTO;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SuperBikeDTO findByIdAndCapacityAndName(Integer id,String cubicCapacity,String name){
		try(Connection connection = DriverManager.getConnection(URL.getConnection(),USERNAME.getConnection(),SECRET.getConnection());) {
			
			String query = "select * from superbikes.superbike_details where bid = ? and cubicCapacity = ? and  companyName = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1,id);
			stmt.setString(2, cubicCapacity);
			stmt.setString(3, name);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()) {
				Integer bid = resultSet.getInt(1);
				String Cname = resultSet.getString(2);
				String type = resultSet.getString(3);
				String capacity = resultSet.getString(4);
				Integer nGears = resultSet.getInt(5);
				Integer torque = resultSet.getInt(6);
				Integer rpm = resultSet.getInt(7);
				String color = resultSet.getString(8);
				String gType = resultSet.getString(9);
				Integer nPersons = resultSet.getInt(10);
				String headType = resultSet.getString(11);
				Double price = resultSet.getDouble(12);
				
				SuperBikeDTO bikeDTO = new SuperBikeDTO();
				
				bikeDTO.setId(bid);
				bikeDTO.setCompanyName(CompanyName.getByName(Cname));
				bikeDTO.setBikeType(type);
				bikeDTO.setCubicCapacity(BikeCC.getByCapacity(capacity));
				bikeDTO.setNoOfGears(nGears);
				bikeDTO.setTorque(torque);
				bikeDTO.setRpm(rpm);
				bikeDTO.setColor(color);
				bikeDTO.setGearShiftingType(gType);
				bikeDTO.setNoOfPersons(nPersons);
				bikeDTO.setHeadLampType(gType);
				bikeDTO.setPrice(price);
				return bikeDTO;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String bikeNameByIdAndcubicCapacity(Integer id, String cubicCapacity ) {
		try(Connection connection = DriverManager.getConnection(URL.getConnection(), USERNAME.getConnection(), SECRET.getConnection());) {
			String query = "select companyName from superbikes.superbike_details where bid = ? and cubicCapacity = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, cubicCapacity);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()) {
				String name = resultSet.getString(1);
				return name;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public SuperBikeDTO updatedetails(Integer id) {
		try(Connection connection = DriverManager.getConnection(URL.getConnection(), USERNAME.getConnection(), SECRET.getConnection());) {
			String query = "update superbike_details set companyName = 'R1' where bid = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, id);
			Integer rowAffected = stmt.executeUpdate();
			if(rowAffected > 0) {
				System.out.println("The Data Provided has been Updated: " + rowAffected + query);
			}
			else {
				System.out.println("Details Not Found In DataBase..!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;//null has being printed
	}

	@Override
	public Boolean deleteBike(String name, Integer nGears) {
		try (Connection connection = DriverManager.getConnection(URL.getConnection(), USERNAME.getConnection(), SECRET.getConnection());){
			String query = "Delete from superbike_details where CompanyName = ? and noOfGears = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setInt(2, nGears);
			Integer noOfRowsAffected = stmt.executeUpdate();
			if(noOfRowsAffected > 0) {
				System.out.println("The Row Deleted From Table is: " + name +" " + nGears);
				System.out.println(noOfRowsAffected);
			}
			else {
				System.out.println("The Details Entered are not Found in Table");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
