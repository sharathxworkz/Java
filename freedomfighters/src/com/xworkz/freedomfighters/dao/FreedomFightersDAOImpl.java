package com.xworkz.freedomfighters.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.freedomfighters.entity.FreedomFightersEntity;
import com.xworkz.freedomfighters.util.FactoryDetails;

public class FreedomFightersDAOImpl implements FreedomFightersDAO{

	EntityManagerFactory factory = FactoryDetails.getDetails();
	
	@Override
	public boolean save(FreedomFightersEntity entity) {
		EntityManager  manager = null;
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
		return false;
	}

@Override
public Boolean insert(List<FreedomFightersEntity> entities) {
	EntityManager  manager = null;
	try {
		 manager = factory.createEntityManager();
		 EntityTransaction tx = manager.getTransaction();
		 tx.begin();
		 for (FreedomFightersEntity freedomFightersEntity : entities) {
			manager.persist(freedomFightersEntity);
		}
			tx.commit();
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
	return FreedomFightersDAO.super.insert(entities);
}	

}
