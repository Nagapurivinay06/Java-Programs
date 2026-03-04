package com.LangFundamentals.Constructors;

public class Practice3 {
	 static int count=0;
	Practice3(){
		    
		   count++;
//		   System.out.println(count);
	}
	public static void main(String[] args) {
		Practice3 p=new Practice3();
		Practice3 p1=new Practice3();
		Practice3 p2=new Practice3();
		Practice3 p3=new Practice3();
		System.out.println("count ="+count);
	}

}
