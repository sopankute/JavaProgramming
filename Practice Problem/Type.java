public class Type{
	public static void main(String[] args){

	// byte b = 100;
	// // b = b + 20; 	// Compile time error (20 - int)
	// b = (byte)(b + 20);		// 120
	// System.out.println(b);


	// float cgpa = 7.9;    // compile time error
	// float cgpa = 7.9f;   
	// cgpa = cgpa + 1.3f;
	// System.out.println(cgpa);


	byte a = 20;
	byte b = 30;

	byte sum = (byte)(a + b);
	System.out.println(sum); 	
	}
}