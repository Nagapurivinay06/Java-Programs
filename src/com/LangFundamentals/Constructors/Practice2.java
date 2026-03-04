package com.LangFundamentals.Constructors;
import java.util.Scanner;
public class Practice2 {
	static Scanner sc=new Scanner(System.in);
	
	  double Length;
	  double breadth;
	
	Practice2(double Length,double breadth){
		 this.Length=Length;
		 this.breadth=breadth;
	}
	public static void main(String[] args) {
		System.out.println("Enter a length value:");
		double length =sc.nextDouble();
		System.out.println("Enter b Breadth balue :");
		double breadth=sc.nextDouble();
		
		double  AreaofTriangle=length*breadth;
		System.out.println("AreaofTriangle :"+AreaofTriangle);
		 sc.close();
	}
	 
}
