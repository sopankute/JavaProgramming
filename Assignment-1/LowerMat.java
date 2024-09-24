import java.io.*;
import java.util.*;

// Question 13

public class LowerMat{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int n = sc.nextInt();
		System.out.print("Enter the no of column : ");
		int m = sc.nextInt();

		int[][] mat1 = new int[n][m];

	//  To generate the random values 	
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1[i].length; j++)
			{
				mat1[i][j] = (int)(1+Math.random()*100);
			}
		}

	//  To Print Matrix	
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1[i].length; j++)
			{
				System.out.print(mat1[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("The Lower Triangle of matrix : ");

    //  To print Lower triangle of matrix
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1[i].length; j++)
			{
				if(i>=j)
				System.out.print(mat1[i][j]+"   ");
			}
			System.out.println("   ");
		}

	}
}
// OUTPUT : 
//		 Enter the no of rows : 3 					Enter the no of rows : 4
//		 Enter the no of column : 3 			    Enter the no of column : 4
//		 53   17   40								97   45   54   31
//		 35   62   27								98   5   20   10
//		 25   93   100								27   68   21   2
//		 The Lower Triangle of matrix :				26   86   56   16
//		 53											The Lower Triangle of matrix :		
//		 35   62									97
//		 25   93   100								98   5
//													27   68   21
//													26   86   56   16
