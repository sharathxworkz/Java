package com.xworkz.trimmer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.trimmer.entity.TrimmerEntity;

public class TrimmerDAOImpl implements TrimmerDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = null;
	@Override
	public Boolean save(TrimmerEntity entity) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			
		}
		catch(PersistenceException p ) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public TrimmerEntity finfById(Integer tid) {
		try {
			manager = factory.createEntityManager();
			TrimmerEntity entity = manager.find(TrimmerEntity.class, tid);
			if(entity != null) {
				System.out.println("The Id of Row Found is:"+ tid);
				return entity;
			}
			else {
				System.out.println("Unable to find");
			}
		}
		catch(PersistenceException p ) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateNameAndLocationById(String name, String color, Integer tid) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			TrimmerEntity entity = manager.find(TrimmerEntity.class, tid);
			if(entity != null) {
				entity.setName(name);
				entity.setColor(color);
				manager.merge(entity);
				
				System.out.println("The Mentioned Id is Updated: "+ tid);
			}
			else {
				System.out.println("Unable to Update");
			}
			tx.commit();
			
		}
		catch(PersistenceException p ) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	}

	@Override
	public void deleteById(Integer tid) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			TrimmerEntity entity = manager.find(TrimmerEntity.class, tid);
			if(entity != null) {
				manager.remove(entity);
				System.out.println("The Mentioned Id is Deleted: "+ tid);
			}
			else {
				System.out.println("Unable to Delete");
			}
			tx.commit();
			
		}
		catch(PersistenceException p ) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	}

}
