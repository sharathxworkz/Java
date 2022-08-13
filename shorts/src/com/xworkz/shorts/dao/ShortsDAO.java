package com.xworkz.shorts.dao;

import com.xworkz.shorts.entity.ShortsEntity;

public interface ShortsDAO {

	Boolean save(ShortsEntity entity);
	ShortsEntity finfById(Integer sid);
	void updateNameAndLocationById(String name, String location,Integer sid);
	void deleteById(Integer sid);
}
