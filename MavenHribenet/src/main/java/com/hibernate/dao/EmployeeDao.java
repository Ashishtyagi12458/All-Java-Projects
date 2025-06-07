package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mavanhar.employee;

public class EmployeeDao {

	private static SessionFactory fectory;
	static 
	{
	  try {
		  fectory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		  
	  }catch(Exception e){
		e.printStackTrace();  
	  }	
	}
	 public void insert(employee es) {
		 es.setId(201);
		 es.setName("ashish");
		 es.setSalary(98838);
		 
		 Session session=fectory.openSession();
		 Transaction tx=session.beginTransaction();
		 session.save(es);
		 tx.commit();
		 session.close();
	 }
	
}
