package com.xworkz.honeyBee.resort.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.metamodel.Type.PersistenceType;

import com.xworkz.honeyBee.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO{

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	 EntityManager manager = null;
	@Override
	public Boolean saveDetails(ResortEntity entity) {
		EntityManager manager = null;
		try {
		 manager = factory.createEntityManager();
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
	
	@Override
	public ResortEntity findByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object obj = query.setFirstResult(1);
			if(obj != null) {
				ResortEntity entity = (ResortEntity)obj;
				return entity;
			}
			else {
				System.out.println("unable to find");
			}
			}
			catch (PersistenceException p) {
				p.printStackTrace();
			}
			finally {
				manager.close();
			}
		return ResortDAO.super.findByName(name);
	}

}
