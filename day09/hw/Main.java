public class Main {
	public static void main(String[] args) {
		
		//Parent class object
		Customer c1 = new Customer(1010, "Ramesh", 200000, "Nagpur");
		c1.dispCustomer();
		c1.calSimpleInterest();

		System.out.println();

		//Child class object
		ClassicCustomer cc1 = new ClassicCustomer(404, "Suresh", 90000, "Nagpur");
		cc1.dispCustomer();
		cc1.calSimpleInterest();

		System.out.println();

		c1 = cc1; //upcasting
		c1.dispCustomer(); // RTP
		c1.calSimpleInterest(); // RTP
	}
}