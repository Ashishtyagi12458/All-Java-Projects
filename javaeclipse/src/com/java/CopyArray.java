package com.java;

public class CopyArray {

	public static void main(String[] args) {
	char copyfrom[]= {'A','S','H','I','S','H'};
	char copyto[]=new char[copyfrom.length];
	System.arraycopy(copyfrom, 0, copyto, 0,copyfrom.length);
    System.out.println(copyto);	

	}

}
