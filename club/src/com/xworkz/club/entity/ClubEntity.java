package com.xworkz.club.entity;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table (name = "club_info")
public class ClubEntity {
	
	@Id
	@Column (name = "cid")
	private Integer cid;
	@Column (name = "clubName")
	private String name;
	@Column (name = "clubLocation")
	private String location;
	@Column (name = "checkInTime")
	private LocalTime checkInTime;
	@Column (name = "checkOutTime")
	private LocalTime checkOutTime;
	@Column (name = "createdBy")
	private String createdBy;
	@Column (name = "createdDate")
	private LocalDate createdDate;
	@Column (name = "updatedBy")
	private String updatedBy;
	@Column (name = "HappyHours")
	private String happyHours;
}
