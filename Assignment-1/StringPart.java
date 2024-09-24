import java.io.*;
import java.util.Scanner;

// Question 15

public class StringPart{
	public static void main(String args[])
	{
		Scanner name = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = name.nextLine();


		// String str1 = str.substring()
		System.out.println(str.length());
		int temp=0;
		int l = str.length()/5;
		System.out.println(l);
		String[] newStr = new String[5];

		if(str.length()%2 != 0)
			System.out.println("Such a string is not divided in equal parts.");
		else{
			for(int i=0; i<str.length(); i+=l)
			{
				String part = str.substring(i, l+i);
				newStr[temp] = part;
				temp++;
			}
		}

		for(int i=0; i<newStr.length; i++)
		{
			System.out.println(newStr[i]);
		}

	}
}
// OUTPUT : 
