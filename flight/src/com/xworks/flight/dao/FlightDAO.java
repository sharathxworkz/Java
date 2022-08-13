package com.xworks.flight.dao;

import com.xworkz.flight.entity.FlightEntity;

public interface FlightDAO {

	Boolean save(FlightEntity entity);
	FlightEntity finfById(Integer fid);
	void updateNameAndLocationById(String name, String location,Integer fid);
	void deleteById(Integer fid);
}
