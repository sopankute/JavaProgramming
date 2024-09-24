/*
Different ways to read from user: using Console class
*/
import java.io.*;
public class ConsoleDemo {
	public static void main(String[] args) {

		Console c = System.console(); // console() is static
		
		System.out.println("Enter name");
		String name = c.readLine();

		System.out.println("Enter weight");
		Double weight = Double.parseDouble(c.readLine());
		System.out.println(name+" "+weight);

		//console can also read password
		System.out.println("Enter password: ");
		char[] pwd = c.readPassword(); //password is masked while typing
		System.out.println(pwd);
	}
}