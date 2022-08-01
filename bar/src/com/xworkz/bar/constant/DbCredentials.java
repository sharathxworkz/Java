package com.xworkz.bar.constant;

public enum DbCredentials {

	URL("jdbc:mysql://localhost:3306/bar"),USERNAME("root"),SECRET("1JT14IS044shadow");
	
	private String value;
	
	private DbCredentials (String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}
}
