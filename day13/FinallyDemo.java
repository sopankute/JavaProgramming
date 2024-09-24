public class FinallyDemo {
	public static void main(String[] args) {
		
		int[] arr = new int[5];

		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i*i; // 0 1 4 9 16 ......25
												//ArrayIndexOutOfBoundsException
			}
		}//try ends

		//catch(ArrayIndexOutOfBoundsException e) {
		catch(ArithmeticException e) { //exception not handled properly
			System.out.println(e);
		}	

		finally { // finally must follow try/catch block
			System.out.println("Finally is always executed");
		}

		//coz of LINE 14, the program crashes, but first, finally block
		//gets executed. Thats why this line is not printed
		System.out.println("rest of the code follows.....");
	}
}