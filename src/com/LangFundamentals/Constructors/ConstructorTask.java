package com.LangFundamentals.Constructors;

public class ConstructorTask {
	
	 ConstructorTask( ){
		System.out.println("non-args constructor called");
		 
	}
	
	String sid;
	String sname;
	int sage;
	
	public static void main(String[] args) {
		System.out.println("main metod started");
//		Default constructors are used in when we donot create an object
//		No-args constructors are used in when we create an object..
//		Parametrized constructors are used in when we pass an arguments ...
		ConstructorTask c=new ConstructorTask();
		new ConstructorTask();
		c=null;
		c.sid="102";
		c.sname="anjali";
		c.sage=21;
		System.out.println("id :"+c.sid);
		System.out.println("sname :"+c.sname);
		System.out.println("sage :"+c.sage);
		
		System.out.println("***************");
		
		ConstructorTask c1=new ConstructorTask();
		c1.sid="102";
		c1.sname="anjali";
		c1.sage=21;
		System.out.println("id :"+c1.sid);
		System.out.println("sname :"+c1.sname);
		System.out.println("sage :"+c1.sage);
		
		System.out.println("main method ended");
	}

}
