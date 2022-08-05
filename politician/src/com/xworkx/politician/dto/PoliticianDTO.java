package com.xworkx.politician.dto;

import com.xworkz.politician.constant.PartyName;
import com.xworkz.politician.constant.PartySymbol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class PoliticianDTO {
	
	private Integer id;
	private String name;
	private PartyName partyName = PartyName.BJP;
	private String president;
	private Integer totalMembers;
	private Double totalBudget;
	private PartySymbol partySymbol = PartySymbol.LOTUS;
	private String location;
	private String headQuaters;
	

}
