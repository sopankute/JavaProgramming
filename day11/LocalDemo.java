public class LocalDemo {

	private int version = 17;

	public void display() { // method - defining class

		class Local { // local inner class
			String name = "Java";

			void msg() {
				System.out.println(name+" "+version);
			}
		} // local end

		Local l = new Local(); // object of Local class
		l.msg();
	}

	public static void main(String[] args) {
		LocalDemo ld = new LocalDemo();
		ld.display();
	}
}