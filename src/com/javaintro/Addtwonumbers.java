package com.javaintro;
public class Addtwonumbers {
	
	public static void main(String[] args) {
		{
			double discount=0.0;
			double discount1=0.1;
			double discount2=0.2;
			double discount3=0.3;
			float price=1000;
			double total=price*discount;
			double actualprice=price-discount-discount1-discount2-discount3;
			//		double Tal=discount%price;
			System.out.println("discount :"+discount);
			System.out.println("price :"+price);
			System.out.println("total :"+total);
			System.out.println("actualprice :"+actualprice);
			System.out.println("$$$$$$$$$$$");
				
		}
		
		byte a=84;
		short b=334;
		
		int ascii='3';
		int asci='@';
		
		float add =a+b;
		float  sub =a-b;
		float mul =a*b;
		float Div =a/b;
		float mod =a%b;
		float and =a&b;
		double total =add +sub+ mul+ Div+ mod+ and;
		
		System.out.println("ascii :"+ascii);
		System.out.println("ascii :"+asci);
		
		System.out.println("sum :"+add);
		System.out.println("sum :"+sub);
		System.out.println("sum :"+mul);
		System.out.println("sum :"+Div);
		System.out.println("sum :"+mod);
		System.out.println("sum :"+ and);
		System.out.println(" Total :"+ total);
	}

}
