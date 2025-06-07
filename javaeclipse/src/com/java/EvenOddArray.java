package com.java;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args)
	{
		int evencount=0;
		int oddcount=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s1.nextInt();
		int num[]=new int[size];		
		System.out.println("enter the element of array");
		for(int i=0;i<size;i++)
		{
			num[i]=s1.nextInt();
		}
		for(int i=0;i<size;i++)
		{
		  if(i%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
				System.out.println("total even no is" +evencount);
				System.out.println("total odd no is" +oddcount);
			
	}
}

