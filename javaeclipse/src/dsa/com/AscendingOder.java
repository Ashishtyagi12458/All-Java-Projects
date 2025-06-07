package dsa.com;

import java.util.Scanner;

public class AscendingOder {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter how many number of array");
		int size=s1.nextInt();
		int num[]=new int[size];
		System.out.println("now enter the array");
		for(int i=0;i<size;i++) {
			num[i]=s1.nextInt();
		}
		boolean isAscending=true;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>num[i+1]) {
				isAscending=false;
			}
		}


	       if(isAscending) {
	           System.out.println("The array is sorted in ascending order");
	       } else {
	           System.out.println("The array is not sorted in ascending order");
	       }

	}

}
