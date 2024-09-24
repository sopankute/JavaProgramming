import java.io.*;
import java.util.*;

// Question 4

public class Palindrome{
	public void isPalindrome(){
		
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter more than three digit number  : ");
		int num = sc.nextInt();
		int num1 = num;
		int num2=0;
		while(num>0){
			int remainder = num % 10;
			num2 = num2 * 10 + remainder;
			num = num / 10;
		}
		if(num1==num2)
			System.out.println(num1+" is a Palindrome Number.");
		else
			System.out.println(num1+" is Not a Palindrome Number.");

		// int[] num2 = new int[num.length()];
		// System.out.print("Enter the more than two digit Number : ");
		// String num = sc.next();
		// int[] num1 = new int[num.length()];
		// for(int i=0; i<num1.length; i++){
		// 	int ch = (int)(num.charAt(i));
		// 	num1[i] = ch;
		// }

		// for(int i=0; i<num1.length; i++)
		// 	System.out.println(num1[i]);

	}
}
/*
OUTPUT :
				1. Enter more than three digit number  : 13531
				13531 is a Palindrome Number.
				
				2. Enter more than three digit number  : 675342
				675342 is Not a Palindrome Number.
*/