//[3]
//compilation command: javac -d . ExceptionDemo3.java
//run command: java exceptions.ExceptionDemo3

package exceptions;
import java.io.*;

public class ExceptionDemo3 {
	public static void main(String[] args) throws IOException{
		//read name and age of a person 			v BufferedReader wraps this class, which in turn wraps System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name:");
		String name = br.readLine(); //reads a line of TEXT
		System.out.println("Enter age:");
		int age = Integer.parseInt(br.readLine());// "20" -> 20
		//since whatever readline() reads is TEXT, it will be in form of a string. 
		//So we use Integer.parseInt() to convert string to int
		System.out.println(name+" "+age);

/*
This time, the exception is shown during COMPILE TIME

ExceptionDemo3.java:14: error: unreported exception IOException; must be caught or declared to be thrown
                String name = br.readLine(); //reads a line of TEXT
                                         ^
ExceptionDemo3.java:16: error: unreported exception IOException; must be caught or declared to be thrown
                int age = Integer.parseInt(br.readLine());// "20" -> 20

Compile time exceptions(checked exceptions) are less severe
*/

/*
readLine() inherently throws IOException.
This means if we are using readLine()
we must handle this IOException also or we also declare it
hence on LINE 6, we declare it, (the caller)JVM will handle it
*/

/*
Enter name:
Java
Enter age:
27 years old 	<- User is smart! LOL

Program crashes.
We get a runtime exception called java.lang.NumberFormatException
*/
	}
}