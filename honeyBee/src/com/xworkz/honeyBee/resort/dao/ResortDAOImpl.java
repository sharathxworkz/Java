package com.xworkz.honeyBee.resort.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.metamodel.Type.PersistenceType;

import com.xworkz.honeyBee.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO{

	@Override
	public Boolean saveDetails(ResortEntity entity) {
		try {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		 EntityManager manager = factory.createEntityManager();
		 EntityTransaction tx = manager.getTransaction();
		 manager.persist(entity);
		 tx.begin();
		 tx.commit();
		 manager.close();
		 factory.close();
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
	
		 return true;
	}

}
