package com.xworkz.superBikes.constants;

public enum BikeCC {
	
	THOUSAND("1000cc"),THOUSANDTEN("1010cc"),THOUSANDTWOHUNDRED("1200cc"),TWOTHOUSAND("2000cc"),THOUSANDSIXHUNDRED("1600cc");
	
	private String capacity;
	
	private  BikeCC(String capacity) {
		
		this.capacity = capacity;
	}

	public String getCapacity() {
		return capacity;
		
	}
	
	public static BikeCC getByCapacity(String capacity) {
		
		BikeCC[] bike = BikeCC.values();
		for (BikeCC bikeCC : bike) {
			if(bikeCC.capacity.equals(capacity)) {
				return bikeCC;
			}
		}
		return null;
		
	}

}
