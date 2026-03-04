package com.javaintro;
 public class practice {

	 int no;
	 String name;
	 
	 static int number=10;
	 static String person="Tea";
	 
	 static {
		 System.out.println("whats ur name");
	 }
	public static void main(String[] args) {
		System.out.println("whats up");
		 {
			  System.out.println("whats going ..!!!");
				 
		  }
		 
		System.out.println("whats going on..!!!");
		System.out.println("whats going on 1..!!!");
		System.out.println("whats going on 2..!!!");
	
		
		practice p=new practice();
			number=10;
			person="vvv";
			p.no=100;
			p.name="anjali";
			 System.out.println("hello every one"); 
			 System.out.println("hello every one:" +p.no);
			 System.out.println("hello every one:" +p.name);
	
	}
	   
	 
	 static {
		 System.out.println("whats going on everywhere");
		 {
			 practice pp=new practice();
	 number=11;
		person="teja";
		pp.no=101;
		pp.name="venky";
		 System.out.println("hello every one :" +number);
		 System.out.println("good :"+person);
		 System.out.println("hello every one:" +pp.no);
		 System.out.println("hello every one:" +pp.name);
	 
  }

	}
      
 }

