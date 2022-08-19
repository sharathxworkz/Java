package com.xworkz.supermarket.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "marketdetails")


public class MarketEntity extends ParentEntity {
	
	@Id
	@Min(value=1,message="id is not valid")
	private Integer mid;
	@NotNull
	private String marketName;
	@NotNull
	private String loaction;
	@Min(value = 10)
	@Max(value = 100)
	private Integer noOfStalls;
	@Min(value = 1000)
	@Max(value = 20000)
	private Integer maxCapacity;

	public MarketEntity(String marketName, String location, Integer noOfStalls, Integer maxCapacity,
			LocalDateTime createdDate, String createdBy, LocalDateTime updatedDate,String updatedBy) {
		
		super(createdDate,createdBy,updatedDate,updatedBy);
		this.marketName = marketName;
		this.loaction = location;
		this.noOfStalls = noOfStalls;
		this.maxCapacity = maxCapacity;

	}
}
