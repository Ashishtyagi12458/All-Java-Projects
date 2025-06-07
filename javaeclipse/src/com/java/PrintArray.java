package com.java;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int name[]=new int[5];
		System.out.println("enter the number");
		for(int i=0;i<name.length;i++)
		{
		 name[i]=s1.nextInt();
		}
		for(int i=0;i<name.length;i++)
		{
		 System.out.println(name[i]);	
		}
		

	}

}
