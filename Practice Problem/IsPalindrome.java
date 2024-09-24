import java.util.Scanner;
import java.io.*;

public class IsPalindrome{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr more than three digit Number : ");
		int num = sc.nextInt();	// 323
		int num1 = num;
		int num2 = 0;

		while(num>0)
		{
			int remainder = num % 10;
			num2 = num2 * 10 + remainder;
			num/=10;
		}
		if(num1==num2)
			System.out.println(num1+" is a Palindrome Number.");
		else
			System.out.println(num1+" is Not a Palindrome Number.");	
	}
}