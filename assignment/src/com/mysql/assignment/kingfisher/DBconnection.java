package com.mysql.assignment.kingfisher;

public enum DBconnection {
	
URL("jdbc:mysql://Localhost:3306/kingfisher"),USERNAME("root"),PASSWORD("1JT14IS044shadow");
	
	
	private String value;

	private DBconnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}

}
