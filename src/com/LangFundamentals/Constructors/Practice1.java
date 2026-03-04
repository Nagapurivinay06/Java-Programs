package com.LangFundamentals.Constructors;
import java.util.Scanner;
public class Practice1 {
	 static Scanner sc=new Scanner(System.in);
	 
	 String name;
	 int Marks1;
	 int Marks2;
	 int Marks3;
	  
	public static void main(String[] args) {
		System.out.println("Enter marks1 :");
		int Marks1 =sc.nextInt();
		System.out.println("Enter marks2 :");
		int Marks2 =sc.nextInt();
		System.out.println("Enter marks3 :");
		int Marks3 =sc.nextInt();
		int TotalMarks=Marks1+Marks2+Marks3;
		int Average =TotalMarks/3;
		System.out.println("TotalMarks :"+TotalMarks);
		System.out.println("Average :"+Average);
		sc.close();
	}

}
