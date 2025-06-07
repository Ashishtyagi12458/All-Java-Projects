package com.java;

import java.util.Scanner;

public class testarray {

	public static void main(String[] args)
	{
		
		Scanner s1=new Scanner(System.in);
		int arr[]=new int[5];	
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=s1.nextInt();
			
		}
		System.out.println("number is:");
		for(int i=0;i<arr.length;i++)
		{
		 System.out.println(arr[i]+ " ");
		}
		
		

	}

}
