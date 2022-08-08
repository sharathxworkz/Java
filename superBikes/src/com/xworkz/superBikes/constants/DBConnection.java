package com.xworkz.superBikes.constants;

public enum DBConnection {
	
	URL("jdbc:mysql://localhost:3306/superbikes"),USERNAME("root"),SECRET("1JT14IS044shadow");
	
	private String connection;
	
	private DBConnection(String connection){
		this.connection = connection;
	}
		

	public String getConnection() {
		return connection;
	}
}
