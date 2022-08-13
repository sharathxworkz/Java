package com.xworkz.club.dao;

import com.xworkz.club.entity.ClubEntity;

public interface ClubDAO {

	Boolean save(ClubEntity entity);
	ClubEntity finfById(Integer cid);
	void updateNameAndhappyHoursById(String name, String happy, Integer cid);
	void deleteById(Integer cid);
}
