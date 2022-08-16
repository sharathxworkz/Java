package com.xworkz.freedomfighters.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@ToString
@Entity
@Table


public class FreedomFightersEntity extends ParentEntity{
	
	@GenericGenerator(name = "manga", strategy = "increment")
	@GeneratedValue(generator = "manga")
	@Id
	private Integer fightersId;
	private String fightersName;
	private LocalDateTime fighterDOB;
	private String FightersBornLocation;

	public FreedomFightersEntity (Integer fightersId ,String fightersName,LocalDateTime fighterDOB, String FightersBornLocation,String CreatedBY,LocalDateTime createdDate,String updatedBy,LocalDateTime updatedDate ){
		
		super();
		this.fightersId = fightersId;
		this.fightersName = fightersName;
		this.fighterDOB = fighterDOB;
		this.FightersBornLocation = FightersBornLocation;
	}
}
