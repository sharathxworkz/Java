package com.xworkz.job.dao;

import com.xworkz.job.dto.JobDTO;

public interface JobDAO {
	
	public Boolean saveDetails(JobDTO jobDTO);
	public JobDTO findByID(Integer id);
	public JobDTO findByIdAndDesignation(Integer id,String designation);
	public JobDTO findByIdAndDesignationAndQualification(Integer id,String designation,String qualification);
	public Integer getTotal();
	public Boolean isFesherById(Integer id);
	public Double getMaxPercentage();
	
}
