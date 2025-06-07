package com.threading;

public class MemoryCleanerDaemo extends Thread
{

	public MemoryCleanerDaemo() {
		setDaemon(true);
		
	}

	public void run() {
		while(true)
		{
			try {
				System.out.println("Memory cleared runing in background");
				Thread.sleep(5000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
