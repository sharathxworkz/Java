package com.xworkz.saloon.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name = "saloon_details")
public class SaloonEntity {
	
	@Id
	@Column (name = "sid")
	private Integer sid;
	@Column (name = "sName")
	private String name;
	@Column (name = "sLocation")
	private String location;
	@Column (name = "openedDate")
	private LocalDate openedDate;
	@Column (name = "openedBy")
	private String openedBy;
	@Column (name = "createdDate")
	private LocalDate createdDate;
	@Column (name = "createdBY")
	private String createdBy;
	@Column (name = "sType")
	private String sType;
	@Column (name = "price")
	private Double price;

}
