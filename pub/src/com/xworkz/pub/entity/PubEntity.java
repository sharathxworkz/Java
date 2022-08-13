package com.xworkz.pub.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "pub_info")
public class PubEntity {
	
	@Id
	@Column (name = "pid")
	private Integer pid;
	@Column (name = "pName")
	private String pubName;
	@Column (name = "pubLocation")
	private String location;
	@Column (name = "createdDate")
	private LocalDate createdDate;
	@Column (name = "updatedDate")
	private LocalDate updatedDate;
	@Column (name = "updatedBy")
	private String updatedBy;
	@Column (name = "createdBy")
	private String createdBy;
	@Column (name = "offers")
	private String offers;
	@Column (name = "pricePerHour")
	private Double pricePerHour;
}
