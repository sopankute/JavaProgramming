public class StaticNested_2{

	static class Nested{
		public static void main(String[] args) {
			System.out.println("Nested main Method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer class main Method");
	}
}

output :
// C:\Users\Admin\Desktop\Java Programming\DurgaSoft\Inner Classes>javac StaticNested_2.java

// C:\Users\Admin\Desktop\Java Programming\DurgaSoft\Inner Classes>java StaticNested_2
// Outer class main Method

// C:\Users\Admin\Desktop\Java Programming\DurgaSoft\Inner Classes>java StaticNested_2$Nested
// Nested main Method

