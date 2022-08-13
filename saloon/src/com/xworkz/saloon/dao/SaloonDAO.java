package com.xworkz.saloon.dao;

import com.xworkz.saloon.entity.SaloonEntity;

public interface SaloonDAO {

	Boolean save(SaloonEntity entity);
	SaloonEntity finfById(Integer sid);
	void updateNameAndLocationById(String name, String location,Integer sid);
	void deleteById(Integer sid);
}
