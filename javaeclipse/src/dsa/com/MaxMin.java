package dsa.com;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
         int num[]=new int[7];
         System.out.println("enter the array element");
       for(int i=0;i<num.length;i++) {
    	   num[i]=s1.nextInt();
       }
       System.out.println("find Maximum Number of array");
       int max=num[0];
       for(int i=0;i<num.length;i++) {
    	   if(max<num[i]) {
    		   max=num[i];
    	   }
       }
       System.out.println("maximum number is "+max);
       System.out.println(" find minuman number of array");
       int min=num[0];
       for(int i=0;i<num.length;i++) {
    	   if( min>num[i]) {
    		   min=num[i];
    	   }
       }
       System.out.println("number is :"+min);
	}

}
