package dsa.com;

import java.util.Scanner;

public class ArrayName {

	public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    System.out.println("enter the array name");
    int size=s1.nextInt();
    String num[]=new String[size];
    
    for(int i=0;i<num.length;i++) {
    	num[i]=s1.next();
    }
    for(int i=0;i<num.length;i++) {
    System.out.println("name is:"+num[i]);
    }
    
	}

}
