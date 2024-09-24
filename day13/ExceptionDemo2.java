//[2] Read a 2 numbers and divide them. Also calculate the length of a string
//compilation command: javac -d . ExceptionDemo2.java
//run command: java exceptions.ExceptionDemo2

package exceptions;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = scanner.nextInt(); // reads a number - int
		
		System.out.println("Enter another number:");
		int y = scanner.nextInt(); // reads a number - int

		System.out.println("Result "+x+"/"+y+" = "+ (x/y));

		System.out.printf("SQRT of %d is %.2f\n", x, Math.sqrt(x));

/*
If user entered y = 0, we will be doing a divide-by-zero.
The program crashes.

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at exceptions.ExceptionDemo2.main(ExceptionDemo2.java:18)

We get a runtime exception called java.lang.ArithmeticException
*/

//		String name = null;
		String name = "CDAC Hyd"; //this works
		System.out.println("Length of string = "+name.length());

/*
on LINE 32, String name is an object which has nothing. That is it's pointing to nothing.
Then how do we calculate the length of...nothing??
The program crashes

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local4>" is null
        at exceptions.ExceptionDemo2.main(ExceptionDemo2.java:34)

We get a runtime exception called java.lang.NullPointerException
*/
	}
}