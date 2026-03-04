package com.fundamentallanguage;
import java.util.Scanner;
public class Morningpractice {
	
	 boolean iseven(int number) {
		return number%2==0;
		 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Morningpractice obj=new Morningpractice();
		
		System.out.println("First number :");
		int num=sc.nextInt();
		boolean result=obj.iseven(num);
		if(result) {
		System.out.println("Even number");
		}
		else {
			System.out.println("odd number");
		}
		sc.close();
//		Morningpractice ob=new Morningpractice();
//		System.out.println("first no :");
//		int i=sc.nextInt();
//		System.out.println("second no:");
//		int j=sc.nextInt();
//		
		 
	}
		 
		 
}
