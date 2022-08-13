package com.xworks.flight.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.flight.entity.FlightEntity;
import static com.xworkz.flight.util.EMFUtil.*;



public class FlightDAOImpl implements FlightDAO {
	EntityManagerFactory factory = getFactory();

	@Override
	public Boolean save(FlightEntity entity) {
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
	public FlightEntity finfById(Integer fid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			FlightEntity entity = manager.find(FlightEntity.class, fid);
			if(entity != null) {
				
				System.out.println("The Row Values are:" + fid);
				return entity;
			}
			else {
				System.out.println("No value Found");
			}
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
	public void updateNameAndLocationById(String name, String location, Integer fid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			FlightEntity entity = manager.find(FlightEntity.class, fid);
			if(entity != null) {
				entity.setFlightName(name);
				entity.setDepartureLocation(location);
				manager.merge(entity);
				
				System.out.println("The Row Values are:" + fid);
			}
			else {
				System.out.println("Unable To Update");
			}
			tx.commit();
			}
			catch (PersistenceException p) {
			 p.printStackTrace();	
			}
			finally {
				
				manager.close();
			}
		
	}

	@Override
	public void deleteById(Integer pid) {
		EntityManager manager = null;
		try {
			manager  = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			FlightEntity entity = manager.find(FlightEntity.class, pid);
			if(entity != null) {
				manager.remove(entity);
				System.out.println("The Deleted row is:" + pid);
			}
			else {
				System.out.println("Unable to Find The Id Entered");
			}
			tx.commit();
		}
		catch (PersistenceException p ) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	}

}
