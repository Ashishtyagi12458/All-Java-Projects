package com.synchronizatio;

public class BankApp {

	public static void main(String[] args) {

		BankAccount acount=new BankAccount();
		Thread Custmer1=new Thread(new Custmer(acount,500,"ashish"));
		Thread Custmer2=new Thread(new Custmer(acount,700,"schile"));
		Thread Custmer3=new Thread(new Custmer(acount,300,"Rahul"));
		
		Custmer1.start();
		Custmer2.start();
		Custmer3.start();

	}

}
