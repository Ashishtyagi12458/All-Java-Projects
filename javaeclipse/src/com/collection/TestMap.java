package com.collection;

public class TestMap {
	
	public static void main(String[] args) {
		
		String name = "Ajay";
		
		byte[] bytes = name.getBytes();
		
		for(int i=bytes.length-1 ; i>=0;i--)
		{
			System.out.print((char)bytes[i]+" ");
		}
		
	}

}
