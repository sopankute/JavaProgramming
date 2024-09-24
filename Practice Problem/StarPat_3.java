import java.io.*;
import java.util.Scanner;

public class StarPat_3{
	public static void main(String args[])
	{
		// Decreasing Pattern
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//			 i=1  * * * * *
//			   2  * * * *
//			   3  * * *
//			   4  * *
//			   5  *