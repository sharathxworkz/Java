package com.xworkz.freedomfighters.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
@ToString

public class ParentEntity {

	private String CreatedBY;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	

}
