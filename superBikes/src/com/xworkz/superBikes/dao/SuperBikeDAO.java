package com.xworkz.superBikes.dao;

import java.util.List;

import com.xworkz.superBikes.dto.SuperBikeDTO;

public interface SuperBikeDAO {

	public Boolean saveDeatils(SuperBikeDTO bikedto);
	public SuperBikeDTO finfById(Integer id);
	public SuperBikeDTO findByIdAndName(Integer id,String name);
	public SuperBikeDTO findByIdAndCapacityAndName(Integer id,String cubicCapacity,String name);
	public String bikeNameByIdAndcubicCapacity(Integer id,String name);
	public SuperBikeDTO updatedetails(Integer id);
	public Boolean deleteBike(String name, Integer nGears);
}
