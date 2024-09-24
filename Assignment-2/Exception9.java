import java.io.*;
import java.util.*;

// Question 32.c

public class Exception9{
	public static double divide(int a, int b){
		int result;
		if(b<0)
			System.out.println("divide by Zero is no possible.");
		else
			return result = a/b;
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(divide(x, y));
		System.out.println("Rest of code....");
	}
}