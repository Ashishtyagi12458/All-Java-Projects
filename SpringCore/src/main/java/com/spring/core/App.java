package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext con = new ClassPathXmlApplicationContext("conifg.xml");
     Student stu1=(Student)con.getBean("stu1");
     System.out.println(stu1);
     Student stu2=(Student)con.getBean("stu2");
     System.out.println(stu2);
     Student stu3=(Student)con.getBean("stu3");
     System.out.println(stu3);
    }
}
