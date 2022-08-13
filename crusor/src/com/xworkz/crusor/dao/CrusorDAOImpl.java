package com.xworkz.crusor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.crusor.entity.CrusorEntity;

public class CrusorDAOImpl implements CrusorDAO{

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = null;
	
	@Override
	public Boolean save(CrusorEntity entity) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}

	@Override
	public CrusorEntity finfById(Integer cid) {
		try {
			manager = factory.createEntityManager();
			CrusorEntity entity = manager.find(CrusorEntity.class, cid);
			if(entity != null) {
				System.out.println("The Id row fetched is:"+ cid);
				return entity;
			}
			else {
				System.out.println("Unable To Find The Data In The Table");
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
	public void updateNameAndLocationById(String name, String location, Integer cid) {
			try {
				manager = factory.createEntityManager();
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				CrusorEntity entity = manager.find(CrusorEntity.class, cid);
				if(entity != null) {
					entity.setName(name);
					entity.setLocation(location);
					manager.merge(entity);
					
					System.out.println("The Row Values are:" + cid);
				}
				else {
					System.out.println("Unable To Update");
				}
				tx.commit();
			}
			catch(PersistenceException p) {
				p.printStackTrace();
			}
		
	}

	@Override
	public void deleteById(Integer cid) {
		manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		CrusorEntity entity = manager.find(CrusorEntity.class, cid);
		if(entity != null) {
			manager.remove(entity);
			
			System.out.println("The Row Values are:" + cid);
		}
		else {
			System.out.println("Unable To Update");
		}
		tx.commit();
		
	}

}
