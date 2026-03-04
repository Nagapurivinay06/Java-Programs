package com.fundamentallanguage;
import java.util.Scanner;
public class Restarunttask {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
 		System.out.println("enter price :");
 		double price=sc.nextDouble();
 		System.out.println("enter quantity :");
 		int quantity=sc.nextInt();
 		
 		double t=calculateitemtotal(price,quantity);
 		double t1=gst(t);
 		double t2=deliverycharges(t1);
 		System.out.println("TOTAL BILL :"+t2);
 		 printbill(t2);
	}
	static double calculateitemtotal(double price,int quantity) {	
		double r=price*quantity;
		return r;
	}
	static double gst(double r) {
		double GST=r+(r*5)/100;
		return GST;
	}
	static double deliverycharges(double c) {
		double charges=c+40;
		return charges;
	}
	static void printbill(double finalamount) {
		System.out.println(finalamount);
	}
	
}
