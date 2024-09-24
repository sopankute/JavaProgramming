import java.io.*;
import java.util.*;

// Question 12

public class TransMat{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n = sc.nextInt();
		System.out.print("Enter the columns : ");
		int m = sc.nextInt();

		int[][] basicMat = new int[n][m]; 
		int[][] transMat = new int[m][n];

		for(int i=0; i<basicMat.length; i++)
		{
			for(int j=0; j<basicMat[i].length; j++)
			{
				basicMat[i][j] = (int)(10 + Math.random()*90);
			}
		}

		System.out.println("The Original Matrix : ");
		for(int i=0; i<basicMat.length; i++)
		{
			for(int j=0; j<basicMat[i].length; j++)
			{
				System.out.print(basicMat[i][j]+"  ");
			}
			System.out.println();
		}

		for(int i=0; i<transMat.length; i++)
		{
			for(int j=0; j<transMat[i].length; j++)
			{
				transMat[i][j] = basicMat[j][i];
	   		}
		}
		System.out.println("The Transpose Matrix : ");
		for(int i=0; i<transMat.length; i++)
		{
			for(int j=0; j<transMat[i].length; j++)
			{
				System.out.print(transMat[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
//				 OUTPUT :
//				 Enter the rows : 3
//				 Enter the columns : 4
//				 The Original Matrix :
//				 38  90  89  99
//				 56  55  23  83
//				 82  53  49  10
//				 The Transpose Matrix :
//				 38  56  82
//				 90  55  53
//				 89  23  49
//				 99  83  10