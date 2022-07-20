package com.xworkz.corejava.collections.arraylist.bike_as_dao.services;

import com.xworkz.corejava.array_as_dao.dao.StudentDAO;
import com.xworkz.corejava.array_as_dao.dao.StudentDAOImpl;
import com.xworkz.corejava.collections.arraylist.bike_as_dao.dao.BikeDAO;
import com.xworkz.corejava.collections.arraylist.bike_as_dao.dao.BikeDAOImpl;
import com.xworkz.corejava.collections.arraylist.bike_as_dao.dto.BikeDTO;

public class BikeServicesImpl implements BikeServices{

	BikeDAO bikeDAO = new BikeDAOImpl();
	
	@Override
	public void addBike(BikeDTO dto) {
		bikeDAO.addBike(dto);
	}

	@Override
	public BikeDTO getBike(String dto) {
	return bikeDAO.getBike(dto);
	}

	@Override
	public void updateBike(BikeDTO dto) {
		bikeDAO.updateBike(dto);
	}

	@Override
	public void deleteBike(BikeDTO dto) {
		bikeDAO.deleteBike(dto);
	}

}
