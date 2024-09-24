import java.io.*;
import java.util.Scanner;

public class StarPat_8{
	public static void main(String args[])
	{
		// int n = Integer.parseInt(args[0]);	    // using Command pmt
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();

		int i, j;

		for(i=1; i<n; i++)					// i<n
		{
			for(j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(j=1; j<i; j++)				// j<i
			{
				System.out.print("* ");
			}
			System.out.println();
		}

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
			for(j=i; j<n; j++)				// j<n
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
  //			             *
  //			           * * *   j<i
  //			         * * * * *
  //			       * * * * * * *
  //			     * * * * * * * * *
  //			   * * * * * * * * * * *
  //	i<n	 * * * * * * * * * * * * *
  //			   * * * * * * * * * * *
  //			     * * * * * * * * *
  //			       * * * * * * *
  //			         * * * * * j<n
  //			           * * *
  //			             *