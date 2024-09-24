public class HDFC implements RBI{ //implements keyword for interface
	double amount = 12345;

	public void withdraw() {
		System.out.println("Withdraw success!");
	}

	public void deposit() {
		System.out.println("Deposit success!");
	}

	public void transfer() {
		System.out.println("Transfer success!");
	}

	void disp() {
		System.out.println("I'm HDFC Bank!");
		double si = (amount * interestRate * 1) / 100;
		System.out.println(si);
	}

	public static void main(String[] args) {
		RBI r = new HDFC();
		r.withdraw();
		r.deposit();
		r.transfer();

		HDFC h = new HDFC();
		h.disp();
	}
}