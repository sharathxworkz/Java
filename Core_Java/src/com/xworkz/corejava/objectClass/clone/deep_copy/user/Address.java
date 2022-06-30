package com.xworkz.corejava.objectClass.clone.deep_copy.user;

public class Address implements Cloneable{
	String city;
	String Country;
	
	Address(String location,String country){
		super();
		this.city = city;
		this.Country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", Country=" + Country + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return (Address) super.clone();
	}
	
	

}
