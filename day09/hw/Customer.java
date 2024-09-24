// Parent class
public class Customer {
	private int cId;
	private String cName;
	private double balance;
	private String city;
	private static String bank = "SBI";

	public Customer(int cId, String cName, double balance, String city) {
		this.cId = cId;
		this.cName = cName;
		this.balance = balance;
		this.city = city;
	}

	//using a method to return balance,
	//because balance is private & can't be accessed directly
	public double getBalance() {
		return balance;
	}

	public void calSimpleInterest() {
		double p = getBalance();
		int t = 5;
		double r = 8.85;
		double si = (p * t * r) / 100;
		System.out.println("Simple interest: "+si);
	}

	public void dispCustomer() {
		System.out.println("Id:\t"+cId);
		System.out.println("Name:\t"+cName);
		System.out.println("City:\t"+city);
		System.out.println("Balance:"+balance);
		System.out.println("Bank:\t"+bank);
	}
}

//child class
class ClassicCustomer extends Customer {
	private static int withdrawLimit = 100000;

	public ClassicCustomer(int cId, String cName, double balance, String city) {
		super(cId, cName, balance, city); //invoke parent class's constructor
	}

	@Override
	public void calSimpleInterest() {
		double p = getBalance();

		int t = 5;
		double r = 9.5; // r changed to 9.5
		double si = (p * t * r) / 100;
		System.out.println("Simple interest: "+ si);
	}

	@Override
	public void dispCustomer() {
		super.dispCustomer(); //invoke parent class's dispCustomer()
		System.out.println("Withdrawal limit: "+ withdrawLimit);
	}

}