package com.xworkz.corejava.collections.arraylist.bike_as_dao.dao;

import java.util.ArrayList;

import com.xworkz.corejava.collections.arraylist.bike_as_dao.dto.BikeDTO;

public class BikeDAOImpl implements BikeDAO {
	
	ArrayList<BikeDTO> bikes = new ArrayList<BikeDTO>();

	@Override
	public void addBike(BikeDTO dto) {
		
		bikes.add(dto);
		System.out.println("Added Bikes is:" + dto);
		
	}
	@Override
	public BikeDTO getBike(String companyName) {
		for(int i = 0; i<bikes.size();i++) {
			if(bikes.get(i).getCompanyName() == companyName) {
				return bikes.get(i);
			}
		}
		return null;
	}

	@Override
	public void updateBike(BikeDTO dto) {
		int count = 0;
		for(int i = 0; i<bikes.size();i++) {
		if(bikes.get(i).getCompanyName() == dto.getCompanyName()) {
			count++;
			bikes.get(i).setCompanyName(dto.getCompanyName());
			System.out.println("Updated CompanyName is:" + bikes.get(i));
		}
	}
		if(count == 0) {
			System.out.println("Invalid Search Details Entered");
		}
}

	@Override
	public void deleteBike(BikeDTO dto) {
		
		int count = 0;
		for (int i=0; i< bikes.size(); i++) {
			if( bikes.get(i) != null && bikes.get(i).getCompanyName() == dto.getCompanyName()) {
				bikes.remove(i);
					count++;
				}
			}	
		if(count > 0) {
			System.out.println("The Mentioned CompanyName and Model Number Bike is " +dto.getCompanyName() +" " + dto.getModelNo() + " being deleted from the ArrayList" );
		}
		
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
