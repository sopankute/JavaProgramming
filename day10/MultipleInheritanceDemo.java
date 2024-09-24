interface Printable {
	void print();
}

interface Showable {
	void show();
}

//multiple inheritance with interfaces
class X implements Printable, Showable {
	public void print() {
		System.out.println("Printing...");
	}

	public void show() {
		System.out.println("Showing...");
	}
}

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		X x1 = new X();
		x1.print();
		x1.show();
	}
}