import java.io.*;
import java.util.*;

public class ConsoleClass{
	public static void main(String[] args) throws IOException{

		Console c = System.console();

		System.out.print("Enter Name : ");
		String name = c.readLine();

		System.out.print("Enter weight : ");
		double weight = Double.parseDouble(c.readLine());

		System.out.println(name+"\t"+weight);

		System.out.println("Enter Password : ");
		char[] pwd = c.readPassword();
		System.out.println(pwd);
	}
}
// output 1:
// 		Enter Name : Sopan Kute
// 		Enter weight : 59.34
// 		Sopan Kute      59.34
// output 2:
// 		Enter Name : Bhushan Tupkari
// 		Enter weight : 64.24
// 		Bhushan Tupkari 64.24
// 		Enter Password :

// 		jhagdyqge


