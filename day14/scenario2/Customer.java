package newpack;

import myexceptions.user.*;

public class Customer {
	private double balance;

	public Customer(double balance) {
		this.balance = balance;
	}

	void withdraw(double amount) throws InsufficientFundsExceptions{
		if(amount > balance)
			throw new InsufficientFundsExceptions("Less balance");
		else
			balance -= amount;
	}

	void display() {
		System.out.println("Balance: "+balance);
	}

	public static void main(String[] args) {
		Customer c = new Customer(5000);
		//try-catch 01
		try {
			c.withdraw(2000); //success		
		}
		catch(Exception e) {
			System.out.println("Exception caught: "+e);
		}
		c.display();
		System.out.println();

		//try-catch 02
		try {
			c.withdraw(6000); // >balance	
		}
		catch(Exception e) {
			System.out.println("Exception caught: "+e);
		}
		c.display();
	}
}