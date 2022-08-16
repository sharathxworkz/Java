package com.xworkz.honeyBee.resort.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;

import lombok.Data;

@Entity
@Table (name = "resort_info")
@Data

@NamedQueries({@NamedQuery(name = "findByName", query = "select resortName from resort_info where resortName = :nm")})
public class ResortEntity implements Serializable{

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
