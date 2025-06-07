package com.java;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int[][] num=new int [3][3];
		int sum=0;
		System.out.println("enter the element");
		for(int i=0;i<num.length;i++)
		{	
			for(int j=0;j<num[i].length;j++)
			{
				num[i][j]=s1.nextInt();	
				
			}
		}
		System.out.println("element in 2D array");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{	
			System.out.println(num[i][j]+" ");
			sum=sum+num[i][j];
			}
             System.out.println("sum is:" +sum);
			 System.out.println();
		}
		
		
	}
		
	}
	
	