package com.threading;

public class TestThreading extends Thread
{
	public void run() {
		System.out.println("threading is running ");
	}

	public static void main(String[] args)
	{
		TestThreading s1=new TestThreading();
		s1.start();
		System.out.println(Thread.currentThread().getName());

	}

}
