package com.synchronizatio;

public class Custmer implements Runnable {
	private BankAccount amount;
	private int widrol;
	private String name;
	
	public Custmer(BankAccount amount, int widrol,String name) {
		super();
		this.amount=amount;
		this.widrol=widrol;
		this.name=name;
	}

	public void run() {
		amount.widrowal(widrol, name);
	}
	
}
