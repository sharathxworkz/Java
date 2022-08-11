package com.xworkz.superBikes.constants;

public enum CompanyName {
	
	NINJA("Ninja-H2"),DUCATI("Ducati"),HAYABUZA("Hayabuza"),R1("Yamha-R1"),GSX("Suzuki-GSX-1000"),BENELLI("Benelli"),BMW("BMW-1250");
	
	
	private String name;
	
	private CompanyName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}
	
	public static CompanyName getByName(String name) {
		
		CompanyName [] companyName = CompanyName.values();
		for (CompanyName companyName2 : companyName) {
			if(companyName2.name.equals(name)) {
				return companyName2;
			}
		}
		return null;
	}

}
