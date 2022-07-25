package com.xworkz.corejava.collections.vector.flight_as_dao.dto;

import java.util.ArrayList;

public class FlightDTO {
	
	private Integer flightNumber;
	private String flightName;
	private String type;
	private String sourceLocation;
	private String destinationLocation;
	private Double price;
	private ArrayList<String>offers;
	
	public FlightDTO(){

	}
	
	public Integer getFlightNumber() {
		return flightNumber;
	}
	
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ArrayList<String> getOffers() {
		return offers;
	}

	public void setOffers(ArrayList<String> offers) {
		this.offers = offers;
	}


}
	
