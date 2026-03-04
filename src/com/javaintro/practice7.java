package com.javaintro;
public class practice7 {
	
	 static String	 name ;
////	 static int a=0;
//	{
//	  int a=0;
//	  int b=0;
//	  a=a+1;
//	
////	a=a+1;
//	System.out.println(a);
//	}
	
	
	  String sname;
	 static int id=101;
	 byte by;
	 short s;
	 int i;
	 long lo;
	 float fl;
	 double d;
	 char r=97;
	 boolean bo =true;
	  
	 byte a=127;
	 short c=17273; 
	 int b=309303;
	 long l=1928239219238383383l; 
	 float f=17738389890422.233333333333332f;
	 
	 
	 void display() {
		 System.out.println("add :"+(a+c));
		 System.out.println("sub :"+(b-c));
		 System.out.println("mul :"+(c*l));
		 System.out.println("div :"+(l/f));

	 }
	public static void main(String[] args) {
		System.out.println("order wise");
		System.out.println("************************");
		practice7 k=new practice7();
		k.sname="kothi";
		 System.out.println(k.sname);
		practice7 o=new practice7();
		o.sname="tej";
		System.out.println("hello :"+o.sname);
		k=o;
//		k=null;
//		o=null;
//		System.gc();
		 
		
		
		practice7 i=new practice7();
		i.display();
		 System.out.println("byte :"+i.by);	
		 System.out.println("byte :"+i.s);	
		 System.out.println("byte :"+i.i);	
		 System.out.println("byte :"+i.lo);	
		 System.out.println("byte :"+i.fl);	
		 System.out.println("byte :"+i.d);
		 System.out.println("byte :"+i.r);
		 System.out.println("byte :"+i.bo);	
		 
		 practice7 p1=new practice7();
		 System.out.println(p1.a);
		System.out.println(p1.c);
		System.out.println(p1.b);
		System.out.println(p1.l);
		System.out.println(p1.f);
		 
		practice7 ps=new practice7();
		name="vinay";
		ps.name="vinay";
		System.out.println(id);
		System.out.println(ps.name);
		System.out.println(name);

		practice7 p=new practice7();
		p.sname="teja";
		p.id=102;
		System.out.println(p.id);
		System.out.println(p.sname);
		
		practice7 p2=new practice7();
		p2.sname="anji";
		p2.id=103; 
		System.out.println(p2.id);
		System.out.println(p2.sname);
		


		
	}

}
