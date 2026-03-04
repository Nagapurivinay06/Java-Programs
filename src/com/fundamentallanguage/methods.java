package com.fundamentallanguage;

public class methods {

	public static void main(String[] args) {
	methods m1=new methods();
//	m1.addition(10,20);
	subtraction(20,30);
	}
	
	static void subtraction(int a,int b) {
		int sub=a-b;
		System.out.println("sub :"+sub);
		multiplication(2,sub);
	}
	
	static void multiplication(int a,int b) {
		int mul=a*b;
		System.out.println("mul :"+mul);
		methods m2=new methods();
		m2.addition(100,mul);
	}
	
	 void addition(int a,int b) {
		 int add=a+b;
		 System.out.println("add :"+add);
		 methods m3=new methods();
		 m3.div(5,100);
	 }
	 
	 void div(long a,long b) {
		 long div=a/b;
		 System.out.println("div :"+div);
	 }
}
