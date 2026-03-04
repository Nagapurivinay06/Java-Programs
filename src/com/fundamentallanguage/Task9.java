package com.fundamentallanguage;
import java.util.Scanner;
public class Task9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
//		Area of Triangle
		System.out.println("Enter a base :");
		double base=sc.nextDouble();
		System.out.println("Enter a height :");
		double height=sc.nextDouble();
		System.out.println("Area of Triangle :"+areaofTriangle(base,height));
		
//		Area of Circle
		System.out.println("Enter a Base :");
		double r=sc.nextDouble();
		System.out.println("Enter a height :");
		double d=sc.nextDouble();
		System.out.println("Area of circle :"+areaofCircle(r,d));
		
//		Area of Rectangle
		System.out.println("Enter a Base :");
		double l=sc.nextDouble();
		System.out.println("Enter a height :");
		double b=sc.nextDouble();
		System.out.println("Area of Rectangle :"+areaofCircle(l,b));
		
//		Area of square
		System.out.println("Enter a Base :");
		double s=sc.nextDouble();
		System.out.println("Enter a height :");
		double s1=sc.nextDouble();
		System.out.println("Area ofsquare:"+areaofSquare(s,s1));
		
		sc.close();
		}
	
		 
	static double areaofTriangle(double b,double h) {
		double AT=0.5*b*h;
		return AT;
	}
	
	static double areaofCircle(double r, double d) {
		double AC=Math.PI*r*r;
		return AC;
	}
	
	static double areaofRectangle(double l,double b) {
		double AR=l*b;
		return AR;
	}
	
	static double areaofSquare(double s,double s1) {
		double AR=s*s1;
		return AR;
	}
}
