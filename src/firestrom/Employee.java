package firestrom;

public class Employee {
	static int empid=01;
	static String empname="Teja";
	static double salary=25000;
	 
	{
		System.out.println("empid :"+empid);
		System.out.println("empname :"+empname);
		System.out.println("emp salary :"+salary);
		double bonus=salary*0.1 ;
		salary=salary+bonus;
		System.out.println("Total:"+salary); 
	}
	
	
	static int employeeid=02;
	static String employeename="Anjali";
	static double Amount=55000;
	{
	 System.out.println("employee id:"+employeeid);
	 System.out.println("employee name:"+employeename);
	 System.out.println("employee salary:"+Amount);
	 double cod=Amount-10000;
	 Amount=Amount-cod;
	 System.out.println("Total:"+cod);
	 
	}
	public static void main(String[] args) {
		Employee e=new Employee();
	}

}
