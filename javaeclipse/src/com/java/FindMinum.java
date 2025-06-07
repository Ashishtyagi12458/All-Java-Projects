package com.java;

import java.util.Scanner;

public class FindMinum {

	public static void main(String[] args) 
	{
	 Scanner s1=new Scanner(System.in);
	 int[] num=new int[7];
	
	 System.out.print("enter the element of array");
	 for(int i=0;i<num.length;i++)
	 {
		 num[i]=s1.nextInt();
	 }
	 
	 int min=num[0];
	 for(int i=0;i<num.length;i++)
	 {
		 if(min>num[i])
		 {
			 min=num[i];
		 }
	 }
	 System.out.println("minumin number is:" +min);

	}

}
