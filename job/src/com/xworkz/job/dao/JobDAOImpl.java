package com.xworkz.job.dao;

import static com.xworkz.job.constant.DBCredentials.SECRET;
import static com.xworkz.job.constant.DBCredentials.URL;
import static com.xworkz.job.constant.DBCredentials.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;
import com.xworkz.job.dto.JobDTO;

public class JobDAOImpl implements JobDAO {

	@Override
	public Boolean saveDetails(JobDTO jobDTO) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			String sql = "insert into job.jobapplicationdetails values (?,?,?,?,?,?)";
			PreparedStatement preStat = connection.prepareStatement(sql);
			preStat.setInt(1, jobDTO.getJid());
			preStat.setString(2, jobDTO.getDesignation().getDesignation());
			preStat.setDouble(3, jobDTO.getAnnualPackage());
			preStat.setString(4,jobDTO.getQualification().getQualification());
			preStat.setDouble(5, jobDTO.getPercentage());
			preStat.setString(6,jobDTO.getFresher());
			int noOfRowsAffected = preStat.executeUpdate();
			if(noOfRowsAffected > 0 ) {
			System.out.println("The Values Inserted Are :" + sql);
			System.out.println(noOfRowsAffected);
			} 
			else {
			System.out.println("Unable to insert Data..!!");
			}
		}	
		catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public JobDTO findByID(Integer id) {

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			String search = "select * from job.jobapplicationdetails where jid = ?";
			PreparedStatement preStat = connection.prepareStatement(search);
			preStat.setInt(1, id);
			ResultSet resultSet = preStat.executeQuery();
			while(resultSet.next()) {
				int jid = resultSet.getInt(1);
				String designation = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String edu = resultSet.getNString(4);
				Double perc = resultSet.getDouble(5);
				String eLevel = resultSet.getNString(6);
				System.out.println(jid+" "+designation+" "+ctc+" "+edu+" "+perc+" "+eLevel);
//				JobDTO jobDTO = new JobDTO();
//				jobDTO.setJid(jid);
//				jobDTO.setDesignation(Designation.valueOf(designation));
//				jobDTO.setAnnualPackage(ctc);
//				jobDTO.setQualification(Qualification.valueOf(edu));
//				jobDTO.setPercentage(perc);
//				jobDTO.setFresher(eLevel);
//				return jobDTO;	
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignation(Integer id, String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignationAndQualification(Integer id, String designation, String qualification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isFesherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMaxPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

}
