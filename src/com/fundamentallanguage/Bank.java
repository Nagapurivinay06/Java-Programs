package com.fundamentallanguage;
import java.util.Scanner;
public class Bank {
static	Scanner sc=new Scanner(System.in);
	  String Name;
	  double Accno;
	  int Pin;
	  double Balance; 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Bank b1=new Bank();
		 b1.Accno=12344678;
		 b1.Name="cherry";
		 b1.Pin=505172;
		 b1.Balance=20000;
		 deposit(b1);
		 withdraw(b1);
		 pincode(b1);
	}
	 
	static void deposit( Bank b1) {
		System.out.println("Enter to deposit :");
		int b=sc.nextInt();
		double amount=b1.Balance+b;
		System.out.println("Total amount :"+amount);	
	}
	
	static void withdraw(Bank b1) {
		System.out.println("Enter amount :");
		int b=sc.nextInt();
		double amount=b1.Balance-b;
		System.out.println("Total amount :"+amount); 
	}
	
	static void pincode(Bank b1) {
		System.out.println("enter pin :");
		int b=sc.nextInt();
		double pin=b1.Pin;
		System.out.println("confirm pin :"+pin);
	}
}
