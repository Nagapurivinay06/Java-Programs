package firestrom;

public class Countingnumbers {
	static int a =6639;
	
	public static void main(String[] args) {
		
		System.out.println("no.of Thounds :"+a/1000);
		System.out.println("no.of hundreds:"+(a/100)%10);
		System.out.println("no.of tens :"+(a/10)%10);
		System.out.println("no. of ones :"+a%10);
		System.out.println("****************");
		notescount();
	}
	static void notescount(){
		int a=6688;
		int twothosands=a/2000;
		a=a%2000;
		System.out.println("Twothousands notes :"+twothosands );
		int fivehundreds=a/500;
		a=a%500;
		System.out.println("fivehundred notes:"+fivehundreds);
		int  hundreds=a/100;
		a=a%100;
		System.out.println("hundred nots :"+hundreds);
		
		int  nhundreds=0/100;
		a=a%100;
		System.out.println("hundred nots :"+nhundreds);
		
		int tens=a/50;
		a=a%50;
		System.out.println("fifty notes :"+tens);
		int ntens=a/30;
		a=a%30;
		System.out.println("tens notes :"+ntens);
		int ones5=a/5;
		a=a%5;
		System.out.println("ones :"+ones5);
		int ones2=a/2;
		a=a%2;
		System.out.println("ones :"+ones2);
		int ones1=a/1;
		a=a%1;
		System.out.println("ones :"+ones1);
		
	}
}
