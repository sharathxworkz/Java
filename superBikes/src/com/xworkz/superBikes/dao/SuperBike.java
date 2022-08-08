package com.xworkz.superBikes.dao;

import java.util.List;

import com.xworkz.superBikes.dto.SuperBikeDTO;

public interface SuperBike {

	public Boolean saveDeatils(SuperBikeDTO bikedto);
	public SuperBikeDTO finfById(Integer id);
	public SuperBikeDTO findByIdAndPresident(Integer id,String name);
	public SuperBikeDTO findByIdAndPresidentAndName(Integer id,String name,String cubicCapacity);
	public String bikeNameByIdAndName(Integer id,String name);
//	default List<Integer> findAllIds(){
//		return null;	
//	}
//	default List<Object> findAllNoOfMembersAndFundAndPartyName(){
//		return null;
//		
//	}
	
}
