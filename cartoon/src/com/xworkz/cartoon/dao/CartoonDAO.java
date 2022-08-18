package com.xworkz.cartoon.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public interface CartoonDAO {

	Boolean save(List<CartoonEntity> entities);
	CartoonEntity findByName(String name);
	Integer total();
	CartoonEntity findByMaxCreatedDate();
	CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name,String country,String gender,String author);
	String findAuthorByName(String name);
	Object[] findNameAndCountryByAuthor(String author);
	LocalDateTime findCreadtedDateByAuthor(String author);
	void updateAuthorByName(String author, String name);
	void updateTypeByName(String name,String type);
	void deleteByName(String name);
}
