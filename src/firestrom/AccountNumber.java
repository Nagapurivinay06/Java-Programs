package firestrom;

public class AccountNumber {
	String name;
	static int id;
	static double balance=10000000;
	static int accountnumber = 123450;

	{
		accountnumber = accountnumber + 1;
		id=id+1;
		balance=balance;
	}

	public static void main(String[] args) {
		

		AccountNumber a = new AccountNumber();
		a.name="teja";
//		a.id=101;
//		a.balance=500000;
		System.out.println("id="+id);
		System.out.println(a.name);
		System.out.println("AccountNo =" +accountnumber);
		System.out.println("Balance =" +balance);
		System.out.println("-----------------------");
		
		AccountNumber a1 = new AccountNumber();
		a1.name="anjali";
//		a1.id=102;
//		a1.balance=200000;
		System.out.println("id ="+id);
		System.out.println(a1.name);
		System.out.println("AccountNO="+accountnumber);
		System.out.println("Balance =" +balance);
        System.out.println("-----------------------");
		
		AccountNumber a2 = new AccountNumber();
		a2.name="vinay";
//		a2.balance=120000;
//		a2.id=103;
		System.out.println("id ="+id);
        System.out.println(a2.name);
		System.out.println("AccountnNo =" +accountnumber);
		System.out.println("Balance =" +balance);
		System.out.println("-----------------------");
		
	}

}
