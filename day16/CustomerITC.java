public class CustomerITC {
	double balance;

	public CustomerITC(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	synchronized public void withdraw(double amount) {
		System.out.println("Going to withdraw!");
		if(amount > balance) {
			System.out.println("Less balance");
			try{
				wait(); // releases lock
			}
			catch(Exception e) { }
		}
		balance = balance - amount;
		System.out.println("Withdraw successfull!");
	}

	synchronized public void deposit(double amount) {
		System.out.println("Going to desposit!");
		balance = balance + amount;
		System.out.println("Deposited!");
		notify(); // releases lock
	}

	public static void main(String[] args) {
		CustomerITC c1 = new CustomerITC(25000);

		new Thread() {
			public void run() {
				c1.withdraw(30000);
			}
		}.start();

		new Thread() {
			public void run() {
				c1.deposit(10000);
			}
		}.start();

		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {}

		System.out.println(c1.getBalance());
	}
}