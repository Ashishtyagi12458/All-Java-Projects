package com.threading;

public class MyThread implements Runnable 
{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args)
	{
		MyThread s1=new MyThread();
		Thread th=new Thread();
		th.start();

	}

}
