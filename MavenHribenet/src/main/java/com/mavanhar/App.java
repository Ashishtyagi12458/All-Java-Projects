package com.mavanhar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{

	public static void main( String[] args )
    {
    Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
     SessionFactory foct=cfg.buildSessionFactory();
     
     children st = new children();
     st.setRoll_no(102);
     st.setName("Ajay");
     st.setCity("Sonepat");
     System.out.println(st);
     
     
     Session sec=foct.openSession();
     Transaction tx=sec.beginTransaction();
     sec.save(st);
     tx.commit();
     sec.close();
  
    }
}
