package firestrom;

public class count {
	static int total=10;
	int a=8;
	{
		a++;
		total++; 
		System.out.println("anji");
	}
	public static void main(String[] args) {

		count c=new count();
		count cc=new count();
		count d=new count();
		count e=new count();
		System.out.println(total);
	 }
}
