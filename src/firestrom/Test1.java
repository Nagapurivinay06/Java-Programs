package firestrom;

public class Test1 {
	int i=10;
	byte b= (byte)200;//Type mismatch: cannot convert from short to byte, int to byte ,long
	//2^8-200=56
	
	void integer(){
		 System.out.println("int:" +i);
		 System.out.println("byte:" +b);
	}


	 void  Byte(){
		 System.out.println("int:" +(i+b));//10-56=46
		 System.out.println("byte:" +(b*i));//2^8-200=56 --> (-56)*10=-560
	}
	 
	 //three digit no. find middle no.
	 int a= 989;
	 void threedigit() {
		 System.out.println("threedigit :" +a);
		 System.out.println("threedigit middle no. :" +8);
	 }
	 
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.integer();
		t.Byte();
		t.threedigit();
		digit();
	}
	static void digit() {
		Test1 t1=new Test1();
		System.out.println(" number :" +t1.i);
	}
}
