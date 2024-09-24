interface Sample {

	default void sayHello() {
		System.out.println("Hello java!");
		sayHi();
	}

	private void sayHi() {
		System.out.println("Hi java!");
	}

	static void welcome() {
		System.out.println("Welcome java!");
	}

	void hello(); // abstract method
}

public class InterfaceDemo implements Sample {
	public void hello() {
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.hello();
		id.sayHello(); // sayHi();
		Sample.welcome(); //welcome() is static
	}
}
