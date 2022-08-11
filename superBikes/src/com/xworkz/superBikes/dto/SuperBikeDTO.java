package com.xworkz.superBikes.dto;

import com.xworkz.superBikes.constants.BikeCC;
import com.xworkz.superBikes.constants.CompanyName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class SuperBikeDTO {
	
private Integer id;
private CompanyName companyName;
private String bikeType;
private BikeCC cubicCapacity;
private Integer noOfGears;
private Integer torque;
private Integer rpm;
private String color;
private String gearShiftingType;
private Integer noOfPersons;
private String headLampType;
private Double price;
}
