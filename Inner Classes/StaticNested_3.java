public class StaticNested_3{

	int x = 11;
	final static int y=22;
	private int z=33;

	static class Nested{
		public void meth(){
			// System.out.println(x);	// Error
			System.out.println(y);
			// System.out.println(z);	// Error
		}
	}
	public static void main(String[] args) {
		
		Nested n = new Nested();
		n.meth();
	}
}