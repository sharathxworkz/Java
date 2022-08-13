package com.xworkz.pub.dao;

import com.xworkz.pub.entity.PubEntity;

public interface PubDAO {

	Boolean save(PubEntity entity);
	PubEntity finfById(Integer pid);
	void updateNameAndLocationById(String name, String location,Integer pid);
	void deleteById(Integer pid);
}
