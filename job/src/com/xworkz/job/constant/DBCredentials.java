package com.xworkz.job.constant;

public enum DBCredentials {
	
	URL("jdbc:mysql://Localhost:3306/job"), USERNAME("root"),SECRET("1JT14IS044shadow");
	
	private String value;
	
	private DBCredentials(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}

}
