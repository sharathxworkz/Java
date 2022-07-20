package com.xworkz.corejava.collections.arraylist.bike_as_dao.dao;

import com.xworkz.corejava.array_as_dao.dto.StudentDTO;
import com.xworkz.corejava.collections.arraylist.bike_as_dao.dto.BikeDTO;

public interface BikeDAO {

	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
}
