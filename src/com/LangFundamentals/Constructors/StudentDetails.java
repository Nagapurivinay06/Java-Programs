package com.LangFundamentals.Constructors;

public class StudentDetails {
	String sname;
	int semarks;
	int ssmarks;
	int sscmarks;
	static double totalmarks;
	static double Average;
	StudentDetails(String sname,int semarks,int ssmarks,int sscmarks){	
		this.sname=sname;
		this.semarks=semarks;
		this.ssmarks=ssmarks;
		this.sscmarks=sscmarks;
		totalmarks = semarks+ssmarks+sscmarks;
//		System.out.println("total marks :"+t);
		Average = totalmarks/3;
//		System.out.println("Average :"+t/2);
		
	}
	
	
	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails("tej",99,99,100);
		s1.display();
		StudentDetails s2=new StudentDetails("anjali",100,100,100);
		s2.display();
		StudentDetails s3=new StudentDetails("vinay",55,78,98);
		 s3.display();
	}
	void display() {
		System.out.println( sname+" "+"totalmarks :"+totalmarks);
		System.out.println(  "Average :"+Average);
	}
}
