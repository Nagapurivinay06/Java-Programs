package com.javaintro;
public class Practice8 {
//	@override
	protected void finilize(){
		System.out.println("finilize method");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Practice8 p=new Practice8();
		Practice8 pp=new Practice8();
		p=null;
//		pp=null;
//		p=pp;
		pp=p;
		 
		System.gc();
		System.out.println(p);
//		Practice8@5ca881b5
		System.out.println(pp);
//		Practice8@24d46ca6
	}

}
