package com.xworkz.shorts.entity;

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


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table (name = "short_details")

public class ShortsEntity {
	
	@Id
	@Column (name = "sid")
	private Integer id;
	@Column (name = "brandName")
	private String name;
	@Column (name = "brandLogo")
	private String logo;
	@Column (name = "manufacturedAt")
	private LocalDate manufacturesAt;
	@Column (name = "manufacturedFactory")
	private String factory;
	@Column (name = "createdAt")
	private LocalDate createdAt;
	@Column (name = "createdBy")
	private String owner;
	@Column (name = "factoryLocation")
	private String location;
	@Column (name = "price")
	private Integer price;

}
