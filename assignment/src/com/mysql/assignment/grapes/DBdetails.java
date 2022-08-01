package com.mysql.assignment.grapes;

public enum DBdetails {
	
	URL("jdbc:mysql://Localhost:3306/grapes"),USERNAME("root"),PASSWORD("1JT14IS044shadow");
	
	private String value;
	
	
	private  DBdetails(String value){
		this.value = value;
		
	}
	
	public String getValue() {
		return value;
		
	}
}
