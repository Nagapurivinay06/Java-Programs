package firestrom;

public class Anjali {
	@Override
	protected void finalize() {
		System.out.println("Finalizing method calling");
	}
	public static void main(String[] args) {
		System.out.println("Garbage collector");
		
		Anjali A=new Anjali();
		
		Anjali A1=new Anjali();
		System.out.println(A1);//firestrom.Anjali@5ca881b5
		System.out.println(A);
		Anjali A2=new Anjali();
		System.out.println(A2);//firestrom.Anjali@24d46ca6
		A=null;
		System.gc();
//		A1=A2;
		System.out.println(A);
		System.out.println(A1);
		System.out.println(A2);
	}

}
