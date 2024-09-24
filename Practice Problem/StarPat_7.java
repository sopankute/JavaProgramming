import java.io.*;
import java.util.Scanner;

public class StarPat_7{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int i, j;

		for(i=1; i<=n; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			for(j=i; j<n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
  //			 decreasing    |decreasing
  //			 * * * * * * * * * * * * *
  //			   * * * * * * * * * * *
  //			     * * * * * * * * *
  //			       * * * * * * *
  //			         * * * * *
  //			           * * *   j<n
  //			             *     n=7
  //			 increasing            