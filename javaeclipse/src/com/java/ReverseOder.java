package com.java;

import java.util.Scanner;

public class ReverseOder {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int[]num=new int[5];
		System.out.println("enter the array element");
		for(int i=0;i<num.length;i++)
		{
		 num[i]=s1.nextInt();
		}
		System.out.println("reverse oder in array");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println("elemwnt are:" +num[i]+ " ");
		}

	}

}
