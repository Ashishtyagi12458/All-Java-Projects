package com.java;

import java.util.Scanner;

public class GridOder {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int[][] num=new int[4][5];
		System.out.println("enter the grid oder");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;i++)
			{
				System.out.print(num[i][j]+ " ");	
			}
			System.out.println();
		}

	}

}
