package com.xworkz.freedomfighters.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryDetails {
	
	private static EntityManagerFactory factory;
	
	
	public static EntityManagerFactory getDetails() {
		return factory;
	}
	
	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}

}

