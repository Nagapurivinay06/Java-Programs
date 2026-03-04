package com.javaintro;
public class customer {
	String name;
	int id;
	double balance;
	static int accountnumber = 123450;
	{
		accountnumber = accountnumber + 1;
	}
	public customer(String name, int id, int balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		System.out.println(name);
		System.out.println(id);
		System.out.println(balance);
		System.out.println(accountnumber);
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		customer c1 = new customer("vinay", 101, 10000);
		customer c2 = new customer("venkat", 102, 20000);
		customer c3 = new customer("krishna", 103, 30000);
		customer c4 = new customer("jeevan", 105, 40000);
	}

}
