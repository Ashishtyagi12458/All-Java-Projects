package dsa.com;

import java.util.Scanner;

public class findIndex {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		System.out.println("enter how many number taken in array "); 
	   int size=s1.nextInt();
	   int num[]=new int[size];
	   System.out.println("now enter the element");
	   for(int i=0;i<num.length;i++) {
		   num[i]=s1.nextInt();
		   
	   }
	   System.out.println("enter the index");
	   int x=s1.nextInt();
	   System.out.println("find the index");
	   for(int i=0;i<num.length;i++) {
		   if(num[i]==x) {
			   System.out.println(i);
		   }
	   }
	}

}
