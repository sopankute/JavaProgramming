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

	//overriding toString() - eliminate the need of getter method
	public String toString() {
		return cId+" "+cName+" "+balance+" "+city+" "+bank;
	}

/*
	public void getCustInfo() {
		System.out.println("Id:\t"+cId);
		System.out.println("Name:\t"+cName);
		System.out.println("City:\t"+city);
		System.out.println("Balance:"+balance);
		System.out.println("Bank:\t"+bank);
	}
*/
	public static void main(String[] args) {
		
		Customer c1 = new Customer(111, "ABC", 50000, "Hyderabad");
		// c1.getCustInfo();
		//System.out.println(c1); // String represented hashcode value (hex value)
		//System.out.println(c1.toString()); //i.e toString gets appended
		//System.out.println(c1.hashCode());

		System.out.println(c1); //c1.toString();
	}

}