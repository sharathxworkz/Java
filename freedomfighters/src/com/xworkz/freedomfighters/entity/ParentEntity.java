package com.xworkz.freedomfighters.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass

public class ParentEntity {

	private String CreatedBY;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
	ParentEntity(String CreatedBY,LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate ){
		this.CreatedBY = CreatedBY;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}
}
