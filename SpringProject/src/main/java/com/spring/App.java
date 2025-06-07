package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Students;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Students s= (Students)context.getBean("stu");
        Students s1= (Students)context.getBean("sut1");
        System.out.println(s);
        System.out.println(s1);
        
    }
}
