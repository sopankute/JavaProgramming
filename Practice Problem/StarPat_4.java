import java.io.*;
import java.util.Scanner;

public class StarPat_4{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//				 decreasing
//				           *
//				         * *
//				       * * *
//				     * * * *
//				   * * * * *
//				 * * * * * *
//				 increasing