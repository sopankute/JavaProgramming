/*
Different ways to read from user: using readLine()
*/
import java.io.*;
public class ReadDemo {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter name");
			String name = br.readLine();
			System.out.println("Enter weight");
			Double weight = Double.parseDouble(br.readLine());
			System.out.println(name+" "+weight);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}