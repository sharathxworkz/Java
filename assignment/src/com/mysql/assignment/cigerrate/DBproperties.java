package com.mysql.assignment.cigerrate;

public enum DBproperties {
	
	URL("jdbc:mysql://Localhost:3306/cigaratee"),USERNAME("root"),PASSWORD("1JT14IS044shadow");
	
	
	private String value;

	private DBproperties(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}

}
