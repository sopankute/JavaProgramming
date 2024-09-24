abstract class ATM {

	void disp() {
		System.out.println("This is Hitachi ATM"); //concrete method
	}

	abstract void withdraw();
	abstract void deposit();
}
//Now, whoever wants ATM, they should implement the above abstract methods
// 66.6% abstraction achieved