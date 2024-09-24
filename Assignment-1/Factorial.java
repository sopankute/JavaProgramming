import java.util.Scanner;

// Question 2

public class Factorial{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number to find a Factorial : ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			if(n==0 && n==1)
				System.out.println("The Factorial : "+i);
			else
				fact *= i;	
		}
		System.out.println("The Factorial : "+fact);
	}
}

// OUTPUT :
// Enter the number to find a Factorial : 5
// The Factorial : 120

// Enter the number to find a Factorial : 9
// The Factorial : 362880
