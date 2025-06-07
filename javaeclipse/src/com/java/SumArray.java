package com.java;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) 
	{
	 Scanner s1=new Scanner(System.in);
	 int[] num=new int[5];
	 int sum=0;
	 System.out.println("enter the element of array");
	 for(int i=0;i<num.length;i++)
	 {
		 num[i]=s1.nextInt();
		 sum=sum+num[i];
	 }
	 System.out.println("sum of array" +sum);

	}

}
