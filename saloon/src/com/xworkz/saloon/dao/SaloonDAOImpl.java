package com.xworkz.saloon.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.saloon.entity.SaloonEntity;
import static com.xworkz.saloon.util.EMFUtil.*;

public class SaloonDAOImpl implements SaloonDAO{
	
	EntityManagerFactory factory = getFactory();
	
	@Override
	public Boolean save(SaloonEntity entity) {
		EntityManager manager = null;
		try {
		manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public SaloonEntity finfById(Integer sid) {
		EntityManager manager = null;
	try {
		manager = factory.createEntityManager();
		SaloonEntity entity = manager.find(SaloonEntity.class, sid);
		if(entity != null) {
			System.out.println("The Id row Found is:" + sid);
			return entity;
		}
		else {
			System.out.println("Unable To Find The Data");
		}
	}
	catch(PersistenceException p) {
		p.printStackTrace();
	}
	finally {
		manager.close();
	}
		return null;
	}

	@Override
	public void updateNameAndLocationById(String name, String location, Integer sid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			SaloonEntity entity = manager.find(SaloonEntity.class, sid);
			if(entity != null) {
				entity.setName(name);
				entity.setLocation(location);
				manager.merge(entity);
				System.out.println("The Updated Id row is:" + sid);
			}
			else {
				System.out.println("Unable To Update The Data");
			}
			tx.commit();
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(Integer sid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			SaloonEntity entity = manager.find(SaloonEntity.class, sid);
			if(entity != null) {
				manager.remove(entity);
				System.out.println("The Deleted Id row is:" + sid);
			}
			else {
				System.out.println("Unable To Delete The Data");
			}
			tx.commit();
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	}

}
