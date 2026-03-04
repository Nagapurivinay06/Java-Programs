package com.fundamentallanguage;
import java.util.Scanner;
public class Practice22 {
	static Scanner sc=new Scanner(System.in);
//	sum of 2 integers
	int integers(int a ,int b) {
		int sum=a+b;
		return sum;	
	}
	
//	subtract of 2 integers
	int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}
	
//	take 3 integers and return largest number
//	double largest(double a,double b,double c) {           error
//		double la=,e,f;
//		return la;
//	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value :");
		int b=sc.nextInt();
		 
		
		Practice22 p=new Practice22();
		int integers=p.integers(a, b);
		p.integers(a, b);
		System.out.println("sum :"+p.integers(a,b));
//		sc.close();
		
		Practice22 p1=new Practice22();
		int sub=p1.sub(a,b);
		p1.sub(a, b);
		System.out.println("sub :"+p1.sub(a, b));
	}

}
