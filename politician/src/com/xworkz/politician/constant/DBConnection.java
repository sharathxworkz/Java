package com.xworkz.politician.constant;

public enum DBConnection {

	URL("jdbc:mysql://Localhost:3306/politicians"),USERNAME("root"),SECRET("1JT14IS044shadow");
	
	
	private String value;
	
	private DBConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}
}
