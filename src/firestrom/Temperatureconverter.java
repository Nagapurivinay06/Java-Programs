package firestrom;

public class Temperatureconverter {
	static int cel;
	static String fah;
	public static void main(String[] args) {
		System.out.println("Temperature convertor");
		double cel=30;
		double fah=((cel*9/5)+32);
		cel();
		fah();  
	}
	
	static void cel() {
		double cel=30;
		 
		System.out.println(cel);
	}
	static void fah() {
		double fah=((cel*9/5)+32) ;
		System.out.println(fah);
	}
}
