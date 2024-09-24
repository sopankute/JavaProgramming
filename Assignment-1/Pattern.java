import java.util.Scanner;

// Question 6

public class Pattern{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();

		for(int i=0; i<n; i++)
		{
			for(int j=n-i; j>1; j--)
				System.out.print(" ");

			for(int j=0; j<=i; j++)
				System.out.print("* ");

			System.out.println();	
		}
	}
}

	// OUTPUT : Enter a Number : 7
	//       *
	//      * *
	//     * * *
	//    * * * *
	//   * * * * *
	//  * * * * * *
	// * * * * * * *