package com.xworkz.flight.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

	private static EntityManagerFactory factory; 
	
	
	public static EntityManagerFactory getFactory() {
		return factory;
		
	}
	
	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}
}
