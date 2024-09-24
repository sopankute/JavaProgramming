//Wrapper classes
public class Wrapper {
	public static void main(String[] args) {
		
		System.out.println("---Boxing---");
		int x = 10;
		Integer y = x; // auto boxing, primitive -> wrapper

		System.out.println(y);
		System.out.println(y.doubleValue()); // 10.0

		//System.out.println(x.doubleValue()); 
		//CE: x cannot be dereferenced, 'coz x is primitive

		System.out.println("\nadding two wrapper objects:");
		Integer a = 123;
		Integer b = 321;
		System.out.println(a + b);

		System.out.println("\n---Unboxing---");
		int z = a; //unboxing, wrapper -> primitive
		System.out.println(z);
	}
}