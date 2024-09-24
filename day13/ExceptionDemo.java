//[1] Read a number and print its square root
//compilation command: javac -d . ExceptionDemo.java
//run command: java exceptions.ExceptionDemo

package exceptions; 

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");

		int number = scanner.nextInt(); // reads a number - int
		System.out.println("SQRT of "+number+" is "+ Math.sqrt(number));

		System.out.printf("SQRT of %d is %.2f\n", number, Math.sqrt(number));

		System.out.println("SQRT of "+number+" is "+ String.format("%.2f", Math.sqrt(number)));

/*
Now even if we are asking the user to enter a number, they enter a string.
The program crashes.

We get a runtime exception called java.util.InputMismatchException
*/
	}
}