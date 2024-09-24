//try, catch, finally, throw, throws
public class ThrowDemo {
								//since its checked and validate() has potential to throw it	
	static void validate(int age) throws IllegalAccessException{
		if(age < 18)
			//explicitly using throw
			// throw new ArithmeticException("Invalid age");
			throw new IllegalAccessException("Invalid age");
		else
			System.out.println("Welcome to vote!");
	}

	public static void main(String[] args) {
		
		try {
			validate(19); // no exception generated
			validate(17); //without try-catch, program crashes here
		}
		catch(Exception e) {
			System.out.println(e); // LINE 17 handled
		}
		finally {
			System.out.println("This is used to close resources before termination");
		}

		System.out.println("rest of the code....");
	}
}

/*
AE - unchecked - runtime
IAE - checked - compile time

ArithmeticException is unchecked exception. So compiler doesn't bother us
but..

IllegalAccessException is checked exception. Compiler checks it. Gives CE
-If a method has a potential to throw an exception & it's checked exception,
so we must have to declare that exception using throws keyword.

*/