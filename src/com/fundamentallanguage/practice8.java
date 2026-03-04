package com.fundamentallanguage;
import java.util.Scanner;
public class practice8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a :");
		double i=sc.nextDouble();
		System.out.println("Enter b:");
		double j=sc.nextDouble();
		findtoprove(i,j);
		
		System.out.println("Enter X:");
		int k=sc.nextInt();	
		System.out.println("Enter Y:");
		int l=sc.nextInt();
		getinstance(k,l);
		
		sc.close();
		
		
		System.out.println("***********");
		getinstance(10,20);
		getinstance(74,3);
	}
	static double  findtoprove(double a,double b) {
		double c=a*b;
		System.out.println("sum :"+c);
		return c;
	}
	
	 static int getinstance(int a, int b) {
		 int d= a+b;
		 System.out.println("sum :"+d);
		 return d;
		 
	 }
}
