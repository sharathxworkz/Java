package com.xworkz.trimmer.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "trimmer_details")
@NamedQueries({@NamedQuery(name = "findByName", query = "select trimmer from TrimmerEntity trimmer where trimmer.name = :nm")})

public class TrimmerEntity {
	
	@Id
	@Column (name = "tid")
	private Integer tid;
	@Column (name = "companyName")
	private String name;
	@Column (name = "trimmerType")
	private String type;
	@Column (name = "trimmerColor")
	private String color;
	@Column (name = "manufacturedDate")
	private LocalDate manufacturedDate;
	@Column (name = "manufacturedBy")
	private String manufacturedBy;
	@Column (name = "manufacturedAt")
	private String manufacturedAt;
	@Column (name = "warrenty")
	private Integer warrenty;
	@Column (name = "updatedAt")
	private LocalDate updatedAt;
	
	//error

}