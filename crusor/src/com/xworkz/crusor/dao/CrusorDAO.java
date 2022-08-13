package com.xworkz.crusor.dao;

import com.xworkz.crusor.entity.CrusorEntity;

public interface CrusorDAO {
	
	Boolean save(CrusorEntity entity);
	CrusorEntity finfById(Integer cid);
	void updateNameAndLocationById(String name, String location,Integer cid);
	void deleteById(Integer cid);

}
