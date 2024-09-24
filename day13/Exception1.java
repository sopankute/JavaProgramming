import java.io.*;

public class Exception1 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");
		int x = 0, y = 0; 		

		try { //in try block, the scope is local, so declare x,y outside
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}

		try {
			int result1 = x/y; //implcitly, throw new java.lang.ArithmeticException();
			System.out.println("Result: "+result1);
		} 
		//catch(ArithmeticException ae) { //the thrown ArithmeticException is caught here
		//or...
		//in case we don't know what is the exception then use super class itself
		catch(Exception e) { //the thrown ArithmeticException is caught here
		
			e.printStackTrace(); // notifying the details of exception
			//or...
			//System.err.println(e); // err -> error stream
			//or...
			//System.err.println(e.getMessage());			
		}

		/*
		Because of handling ArithmeticException, the program does
		not crash at LINE 14. It displays the error (because of
		catch block) and moves on to executing the rest of the code
		*/

		int result2 = x+y;
		System.out.println("Result: "+result2);

		System.out.println("rest of the code follows...");

	}
}