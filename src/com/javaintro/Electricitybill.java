package com.javaintro;
public class Electricitybill {
	int units=500;
	double rateperunits=5;
	static double gstPercentage=5; 
	static double gstAmount;
	
	double basicbill;
	double totalbill;
	 static void calculategst(double basicbill) {
		 gstAmount=(basicbill*gstPercentage)/100;
	 }
	 
	 void generateelectricity() {
		 basicbill=units*rateperunits;
		 calculategst(basicbill);
		 totalbill=basicbill+gstAmount;
		 System.out.println(basicbill);
		 System.out.println(totalbill);
		 
	 }
	public static void main(String[] args) {
		Electricitybill e1=new Electricitybill();
		e1.generateelectricity();
		 System.out.println(e1. units);
		 System.out.println(e1.rateperunits);
		 System.out.println(e1.gstPercentage);
		 System.out.println(e1.gstAmount);
		
		
	}

}
