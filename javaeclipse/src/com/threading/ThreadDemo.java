package com.threading;

public class ThreadDemo {

	public static void main(String[] args)
	{

		Thread t1=new Thread();
		System.out.println(t1.getName());
		t1.setName("ashish");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t1.setPriority(8);
		System.out.println(t1.getPriority());
	}

}
