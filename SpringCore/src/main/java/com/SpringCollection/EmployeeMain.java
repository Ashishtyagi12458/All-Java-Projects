package com.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext cont=new ClassPathXmlApplicationContext("com/SpringCollection/cconifg.xml");
		 Employee emp1=(Employee)cont.getBean("emp1");
		 System.out.println(emp1.getName());
		 System.out.println(emp1.getPhone());
		 System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourse());

	}

}
