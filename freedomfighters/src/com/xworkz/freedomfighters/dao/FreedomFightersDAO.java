package com.xworkz.freedomfighters.dao;

import java.util.List;

import com.xworkz.freedomfighters.entity.FreedomFightersEntity;

public interface FreedomFightersDAO {
	
	boolean save(FreedomFightersEntity entity);

	default  Boolean insert(List<FreedomFightersEntity> entities) {
		return false;
		
	}
}
