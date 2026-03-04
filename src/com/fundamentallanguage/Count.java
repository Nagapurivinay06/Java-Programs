package com.fundamentallanguage;

public class Count {
	 static int i=0;
	  void naturalnumbers() {
		 if(i<=9) {
			 i++;
			 System.out.println(i);
			 naturalnumbers();
		 }
		  return;	 
	 }
	 
	public static void main(String[] args) {
		 
		Count t=new Count();
		t.naturalnumbers();
		}
	 }
