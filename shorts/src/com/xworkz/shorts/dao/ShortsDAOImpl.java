package com.xworkz.shorts.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.shorts.entity.ShortsEntity;
import static com.xworkz.shorts.util.EMFUtil.*;

public class ShortsDAOImpl implements ShortsDAO{
	EntityManagerFactory factory = getFactory();

	@Override
	public Boolean save(ShortsEntity entity) {
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
	public ShortsEntity finfById(Integer sid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			ShortsEntity entity = manager.find(ShortsEntity.class, sid);
			if(entity != null) {
				System.out.println("thisd are the values:" + sid);
				return entity;
			}
			else {
			
				System.out.println("not found");
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
			ShortsEntity entity = manager.find(ShortsEntity.class, sid);
			if(entity != null) {
				
				System.out.println("This is the Id row That is updated:"+ sid);
				entity.setName(name);
				entity.setLocation(location);
				manager.merge(entity);
			}
			else {
			
				System.out.println("unable to update");
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
	public void deleteById(Integer sid) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			ShortsEntity entity = manager.find(ShortsEntity.class, sid);
			if(entity != null) {
				
				manager.remove(entity);
				System.out.println("This is the Id row Deleted:" + sid);
			}
			else {
			
				System.out.println("not found");
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

}
