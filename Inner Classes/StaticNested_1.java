public class StaticNested_1{

	static class Nested{
		public void meth1(){
			System.out.println("Static Nested class meth1() method");
		}
	} 

	public static void main(String[] args) {

		Nested n = new Nested();			// without outer class obj
		n.meth1();

	// 	StaticNested_1.Nested s= new StaticNested_1.Nested(); 	// valid
	// 	s.meth1();
	}
}