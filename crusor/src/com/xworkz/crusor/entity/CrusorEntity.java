package com.xworkz.crusor.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name = "crusor_details")

public class CrusorEntity {
	
	@Id
	@Column (name = "crusorId")
	private Integer id;
	@Column (name = "crusorName")
	private String name;
	@Column (name = "crusorPicklocation")
	private String location;
	@Column (name = "createdDate")
	private LocalDate createdDate;
	@Column (name = "createdBy")
	private String createdBy;
	@Column (name = "updatedDate")
	private LocalDate updatedDate;
	@Column (name = "upgradedBy")
	private String updatedBy;
	@Column (name = "crusorSize")
	private Double size;
	@Column (name = "crusorPrice")
	private Double price;
}
