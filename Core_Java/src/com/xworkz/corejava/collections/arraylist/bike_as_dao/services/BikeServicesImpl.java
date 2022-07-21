package com.xworkz.corejava.collections.arraylist.bike_as_dao.services;

import com.xworkz.corejava.array_as_dao.dao.StudentDAO;
import java.util.ArrayList;
import com.xworkz.corejava.array_as_dao.dao.StudentDAOImpl;
import com.xworkz.corejava.collections.arraylist.bike_as_dao.dao.BikeDAO;
import com.xworkz.corejava.collections.arraylist.bike_as_dao.dao.BikeDAOImpl;
import com.xworkz.corejava.collections.arraylist.bike_as_dao.dto.BikeDTO;

public class BikeServicesImpl implements BikeServices{

	BikeDAO bikeDAO = new BikeDAOImpl();
	
	@Override
	public void addBike(BikeDTO dto) {
		int modelNo = dto.getModelNo();
		int count = 0;
		while(modelNo != 0) {
		count++;
		}
		if(count > 0){
		bikeDAO.addBike(dto);
		}
		else {
			System.out.println("The Bike Details Entered are not matching the Standards");
		}
	}

	@Override
	public BikeDTO getBike(String dto) {
	return bikeDAO.getBike(dto);
	}

	@Override
	public void updateBike(BikeDTO dto) {
		int count = 0;
		double price = dto.getPrice();
		if(price < 140000) {
			count++;
		}
		if(count == 0) {
		bikeDAO.updateBike(dto);
		}
		else {
			System.out.println("The Bike You Entered is not Found");
		}
	}

	@Override
	public void deleteBike(BikeDTO dto) {
		int count = 0;
		String name  = dto.getCompanyName();
		while(name.equals(getBike(name))) {
			count++;
		}
		if(count > 0) {
		bikeDAO.deleteBike(dto);
		}
		else {
			System.out.println();
		}
	}

}
