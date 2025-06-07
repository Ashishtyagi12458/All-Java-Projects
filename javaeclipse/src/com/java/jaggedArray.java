package com.java;

import java.util.Scanner;

public class jaggedArray {

	public static void main(String[] args) {
	int[][] num=new int[3][];
	num[0]=new int[6];
	num[1]=new int[5];
	num[2]=new int[3];
	Scanner s1=new Scanner(System.in);
	System.out.print("enter the element");
	for(int i=0;i<num.length;i++)
	{
		for(int j=0;j<num.length;j++)
		{
			num[i][j]=s1.nextInt();
			
		}
	}
	System.out.println("print jagged element");
	for(int i=0;i<num.length;i++)
	{
		for(int j=0;j<num.length;j++)
		{
			System.out.println(num[i][j]+ " ");
		}
		System.out.println(); 
		
	}

	}

}
