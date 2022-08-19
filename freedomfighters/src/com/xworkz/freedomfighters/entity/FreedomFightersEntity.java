package com.xworkz.freedomfighters.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Getter
@Setter
@Table (name = "fighters_details")


public class FreedomFightersEntity extends ParentEntity{
	
	@GenericGenerator(name = "manga", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer fightersId;
	private String fightersName;
	private LocalDateTime fighterDOB;
	private String FightersBornLocation;

	public FreedomFightersEntity (String fightersName,LocalDateTime fighterDOB, String FightersBornLocation,String createdBY,LocalDateTime createdDate,String updatedBy,LocalDateTime updatedDate ){
		
		super(createdBY,createdDate,updatedBy,updatedDate);
		this.fightersName = fightersName;
		this.fighterDOB = fighterDOB;
		this.FightersBornLocation = FightersBornLocation;
	}
}
