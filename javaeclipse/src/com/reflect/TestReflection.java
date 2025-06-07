package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws ReflectiveOperationException{

		Class c=Class.forName("java.lang.String");
		System.out.println(c);
		 boolean s=c.isInterface();
		 System.out.println(s);
		 Method[] dc=c.getDeclaredMethods();
		 for(Method m:dc) {
			 System.out.println(m);
		 }
		System.out.println("_______________________");
		Field[] df=c.getDeclaredFields();
		for(Field f:df) {
			System.out.println(f);
		}
		
		
		
	}

}
