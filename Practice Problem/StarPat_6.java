import java.io.*;
import java.util.Scanner;

public class StarPat_6{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int i, j;
		for(i=1; i<=n; i++)
		{
			for(j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(j=1; j<=i; j++)			// j<i or
			{
				System.out.print("* ");
			}
			for(j=1; j<i; j++)			// j<i
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
  //				  decraesing     n=7
  //				             *   j<i
  //				           * * *
  //				         * * * * *
  //				       * * * * * * *
  //				     * * * * * * * * *
  //				   * * * * * * * * * * *
  //				 * * * * * * * * * * * * *
  //				  increasing   |increasing