package com.xworkz.job.dto;

import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class JobDTO {
	
	private Integer jid;
	private Designation designation=Designation.DEFAULT;
	private Double annualPackage;
	private Qualification qualification=Qualification.DEFAULT;
	private Double percentage;
	private String fresher;
	

		
	
}
