package com.xworkz.superBikes.constants;

public enum CompanyName {
	
	NINJA("Ninja-H2"),DUCATI("Ducati"),HAYABUZA("Hayabuza"),R1("Yamha-R1"),GSX("Suzuki-GSX-1000"),BENELLI("Benelli"),BMW("BMW-1250");
	
	
	private String companyName;
	
	private CompanyName(String name) {
		this.companyName = name;
	}
	
	public String getName(String name) {
		return name;
		
	}

}
