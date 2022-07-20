package com.xworkz.corejava.collections.arraylist.bike_as_dao.services;

import com.xworkz.corejava.collections.arraylist.bike_as_dao.dto.BikeDTO;

public interface BikeServices {

	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
}
