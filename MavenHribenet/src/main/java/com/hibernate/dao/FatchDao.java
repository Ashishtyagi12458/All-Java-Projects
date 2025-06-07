package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FatchDao {
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
     SessionFactory foctory=cfg.buildSessionFactory();
     Session session =foctory.openSession();
     
     session.close();
     

}
