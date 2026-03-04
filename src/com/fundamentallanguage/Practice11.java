package com.fundamentallanguage;
import java.util.Scanner;
public class Practice11 {
//	static Scanner sc=new Scanner(System.in);
	 
//	pass arg with price,items and price*items
	double Shoppingmall(double price,int items) {
//		Scanner sc=new Scanner(System.in);
		double shoping=price*items;
		return shoping;
	}
	
//	add gst, 5% -->assign a variable with that mulitiply and by percentage (s*5)/100
	double gst(double t) {
//		Scanner sc=new Scanner(System.in);
		double g=t+(t*5)/100;
		return g;
	}
	
//	damage deduction--> 1%
	static double damage(double d) {
		double b=d-(d*1)/100;
		return b;
	}
	
//	void print is a method and print final method
	void print(double finalamount) {
		System.out.println(finalamount);
	}
	public static void main(String[] args) {
		Practice11 p=new Practice11();
		Practice11 p1=new Practice11();
		Practice11 p2=new Practice11();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price : ");
		double price=sc.nextDouble();
		
		Scanner c=new Scanner(System.in);
		System.out.println("enter items :");
		int items=sc.nextInt();
		
		 double d=p.Shoppingmall(price,items);
//		 total cost :21000.0
		 double d1=p1.gst(d);
		 
//		 total cost :20790.0
		 double d2=damage(d1);
		  p2.print(d2);
		  System.out.println("total cost :"+d2);
	}
	
	
}
