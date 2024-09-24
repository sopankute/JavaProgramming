public class SBI extends ATM { // must implement all abstract
	
	@Override //since implementing abstract method is like overrriding
	void withdraw() { //abstract class implemented
		System.out.println("Withdrawn successfully!");
	}
	void deposit() { //abstract class implemented
		System.out.println("Deposited successfully!");
	}

	void getSBI() { //own method of SBI
		System.out.println("This is SBI Bank ATM...!");
	}

	public static void main(String[] args) {
		ATM a = new SBI(); //upcasting
		a.disp();
		a.withdraw();
		a.deposit();
		//a.getSBI(); //CE because its child specific not parent specific

		SBI s = new SBI();
		s.getSBI();
	}
}