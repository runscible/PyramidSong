package com.services;


import java.util.List;

import javax.persistence.EntityManager;

import org.eclipse.jetty.server.Server;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.models.Empleado;

public class EmpleadoService {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	private double sueldoDouble; 
	
	@SuppressWarnings("unchecked")
	public List <Empleado> getAllEmpleado (){
			EntityManager session = sf.createEntityManager();
		    List<Empleado> empleados = session.createQuery("FROM Empleado").getResultList();
			return empleados; 
		}
	
	
	public Empleado  createEmpleado(  String nombre , String sueldo){
		//test jetty server 
		Server server = new Server(4567); 
		
		Configuration cfg = new Configuration(); 
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory(); 
		Session session = factory.openSession(); 
		Transaction t = (Transaction) session.beginTransaction(); 
		
		Empleado empleado = new Empleado();
		empleado.setNombre(nombre);
		//esto esta asi porque desde la vista recibe un String y la tanto la 
		//base de datos como el la clase "Empleado" me piden un double 
		empleado.setSueldo(sueldoDouble = Double.parseDouble(sueldo));
		//Integer idLocal = empleado.getId(); 
		//empleados.put(idLocal.toString(), empleado.getNombre()); 
		System.out.println(empleado.getNombre());
		System.out.println(empleado.getSueldo());
		
		session.persist(empleado); 
		t.commit();
		System.out.println("los datos se guardaron correctamente :) ");
		//session.close(); 
		
		return empleado; 
		
	}
}



	

