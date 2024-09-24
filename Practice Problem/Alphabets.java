import java.io.*;
import java.util.*;

public class Alphabets{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Alphabet in UpperCase or Lowercase : ");
		char ch = sc.next().charAt(0);


		if(ch=='a' || ch=='A'|| ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			System.out.println(ch+" is Vowel.");
		else
			System.out.println(ch+" is Consonant.");
	}
}