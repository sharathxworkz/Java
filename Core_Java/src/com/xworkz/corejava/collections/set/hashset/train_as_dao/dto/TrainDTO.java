package com.xworkz.corejava.collections.set.hashset.train_as_dao.dto;

public class TrainDTO {
	
	private Integer trainNumber;
	private String trainName;
	private Integer noOfVaggen;
	private String Source;
	private String Destination;
	private double price;
	
	public TrainDTO(){
		
	}

	public Integer getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Integer getNoOfVaggen() {
		return noOfVaggen;
	}

	public void setNoOfVaggen(Integer noOfVaggen) {
		this.noOfVaggen = noOfVaggen;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TrainDTO [trainNumber=" + trainNumber + ", trainName=" + trainName + ", noOfVaggen=" + noOfVaggen
				+ ", Source=" + Source + ", Destination=" + Destination + ", price=" + price + "]";
	}
	
	

}
