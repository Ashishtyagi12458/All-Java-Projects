package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAdvanceMethod {

	public static void main(String[] args) {
		ArrayList<String> s1=new ArrayList<String>();
        s1.add("Apple");
        s1.add("banana");
        s1.add("roll");
        System.out.println("name is :"+s1);
        
        //2.consuctur whit collection.
        List<String> s2= Arrays.asList("apple","banana","rahul");
        ArrayList<String>x1=new ArrayList<String>(s2);
        System.out.println("list is "+x1);
	}

}
