package com.mysql.assignment.perfume;

public enum DBproperties {

	URL("jdbc:mysql://Localhost:3306/perfume2"),USERNAME("root"),PASSWORD("1JT14IS044shadow");
	
	
	private String value;

	private DBproperties(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}
}
