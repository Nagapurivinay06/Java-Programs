package firestrom;

public class Operations {
	int a=10;
	int a1=20;
	 
	byte b=1;
	byte b1=2;
	 
	short c=11;
	short c1=22;
	 
	void add(){
		System.out.println("addition:" +(a+a1));
		System.out.println("addition:" +(b+b1));
		System.out.println("addition:" +(c+c1));
	}
	void sub(){
		System.out.println("sub:" +(a-a1));
		System.out.println("sub:" +(b-b1));
		System.out.println("sub:" +(c-c1));
	}
	void mul(){
		System.out.println("mul:" +(a*a1));
		System.out.println("mul:" +(b*b1));
		System.out.println("mul:" +(c*c1));
	}
	void div(){
		System.out.println("div:" +(a/a1));
		System.out.println("div:" +(b/b1));
		System.out.println("div:" +(c/c1));
	}
	public static void main(String[] args) {
		Operations op=new Operations();
		op.add();
		op.sub();
		op.mul();
		op.div();
	}

}
