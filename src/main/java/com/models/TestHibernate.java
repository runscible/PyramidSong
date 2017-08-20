package com.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
	/*
	public static void main(String[] args) {
		Configuration cfg = new Configuration(); 
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory(); 
		Session session = factory.openSession(); 
		Transaction t = (Transaction) session.beginTransaction(); 
		
		Empleado e = new Empleado(); 
		e.setNombre("Barack");
		e.setSueldo(12);
		session.persist(e); 
		t.commit();
		System.out.println("transaccion finalizada ");
		session.close();  
	
	
	}
	*/

}
