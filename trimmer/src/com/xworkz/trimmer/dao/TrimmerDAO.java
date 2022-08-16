package com.xworkz.trimmer.dao;

import com.xworkz.trimmer.entity.TrimmerEntity;

public interface TrimmerDAO {
	
	Boolean save(TrimmerEntity entity);
	TrimmerEntity finfById(Integer tid);
	void updateNameAndLocationById(String name, String color,Integer tid);
	void deleteById(Integer tid);
	default TrimmerEntity findByName(String name) {
		return null;
		
	}

}
