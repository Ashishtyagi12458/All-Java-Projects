package com.synchronizatio;

public class BankAccount {
	private int balance=1000;
	
	public synchronized void widrowal(int amount, String name) {
		
		System.out.println(name+"is trying to Widrowal"+ amount);
		if(balance>=amount) {
			System.out.println(name+"is completing widrowal");
			try {
				Thread.sleep(1000);
			}catch(  Exception e) {
				e.printStackTrace();
				
			}
			balance-=amount;
			System.out.println(name+"has successfully widrol"+amount);
			
		}
		else {
			System.out.println(name+"Connot widrol the money due to null balance");
		}
		System.out.println("Remaning balance"+balance);
			
		
	}

}
