package com.xworkz.pub.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.pub.entity.PubEntity;
import static com.xworkz.pub.util.EMFUtil.*;

public class PubDAOImpl implements PubDAO {

	EntityManagerFactory factory = getFactory();
//	EntityManager manager = null;//manager should be always inside the method but before try block
	@Override
	public Boolean save(PubEntity entity) {
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
	public PubEntity finfById(Integer pid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			PubEntity entity = manager.find(PubEntity.class, pid);
			if(entity != null) {
				
				System.out.println("The Row Values are:" + pid);
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
	public void updateNameAndLocationById(String name, String location, Integer pid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			PubEntity entity = manager.find(PubEntity.class, pid);
			if(entity != null) {
				entity.setPubName(name);
				entity.setLocation(location);
				manager.merge(entity);
				
				System.out.println("The Row Values are:" + pid);
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
			PubEntity entity = manager.find(PubEntity.class, pid);
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