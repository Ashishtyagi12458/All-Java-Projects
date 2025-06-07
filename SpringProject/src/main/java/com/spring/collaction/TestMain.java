package com.spring.collaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\spring\\collaction\\collectionconfig.xml");
		emp e=(emp)context.getBean("em");
		   System.out.println(e.getName());
		   System.out.println(e.getAddress());
		   System.out.println(e.getPhone());
		   System.out.println(e.getCourse());

	}

}
