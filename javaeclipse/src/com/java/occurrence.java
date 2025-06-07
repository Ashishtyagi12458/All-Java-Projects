package com.java;

import java.util.Scanner;

public class occurrence {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int[] num=new int[10];
		int cout=0;
		System.out.println("enter the element of array");
		for(int i=0;i<num.length;i++)
		{
			num[i]=s1.nextInt();
		}
		System.out.println("enter the voule which find");
		int n=s1.nextInt();
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==n)
			{
				cout++;
			}
		}
		System.out.println("number is"+n+" " +cout+ "time in array");

	}

}
