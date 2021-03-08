package com.test.sp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CommonEntityManager {

	private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("com.test.sp");
	
	public static EntityManager getEM() {
		return EMF.createEntityManager();
	}
}
