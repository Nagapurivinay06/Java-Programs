package firestrom;

public class task1 {
	
  static void hello1() {
	  System.out.println("hello"); 
  }
  
 static void hii1(){
	 System.out.println("hii");
 }
 
 void hello(){
	 System.out.println("hello 1");
 }
 void hii() {
	  System.out.println("hii 2");
  }
  
 static {
	  hello1();
	  hii1();
	  task1 t1=new task1();
	  t1.hello();
	  t1.hii();
  }
 
	public static void main(String[] args) {
		
	}

}
