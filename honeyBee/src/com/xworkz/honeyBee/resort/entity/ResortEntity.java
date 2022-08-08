package com.xworkz.honeyBee.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name = "resort_info")
@Data

public class ResortEntity {

@Id	
@Column (name =" rId")
private Integer id;
@Column (name = "resortName")
private String name;
@Column (name = "location")
private String location;
@Column (name = "checkInTime")
private LocalTime checkInTime;
@Column (name = "checkOutTime")
private LocalTime checkOutTime;
@Column (name = "createdBy")
private String createBy;
@Column (name = "createDate")
private LocalDate createDate;
@Column (name = "updateDate")
private LocalDate updateDate;
@Column (name = "owner")
private String owner;
@Column (name = "pricePerDay")
private Double pricePerDay;
	
}
