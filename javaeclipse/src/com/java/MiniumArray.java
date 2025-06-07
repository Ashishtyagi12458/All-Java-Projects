package com.java;

import java.util.Scanner;

public class MiniumArray {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int name[]=new int[5];
		
		System.out.println("enter the element");
		for(int i=0;i<name.length;i++)
		{
			name[i]=s1.nextInt();
		}
		int nim = name[0];
		for(int i=0;i<name.length;i++)
		{
			if(name[i]<nim)
			{
				nim=name[i];
			}
		}
		System.out.println(nim);
	}

}
