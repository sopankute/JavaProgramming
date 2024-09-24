import java.util.Scanner;

// Question 1

public class UserInput{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number is : ");
		int a = sc.nextInt();

		if(a >= 0)
			System.out.println("The user enter a Positive Integer.");
		else
			System.out.println("The user enter a Negative Integer.");
	}
}

// OUTPUT :
// Enter the Number is : 34
// The user enter a Positive Integer.

// Enter the Number is : -19
// The user enter a Negative Integer.