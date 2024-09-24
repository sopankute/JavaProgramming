import java.io.*;
import java.util.*;

public class TwoDArray{
	public static void main(String[] args){

		// int[][] arr = new int[][];   // 2-D Array

		// int [][][] arr = new int[][][];		// 3-D Array

		// String [][] str;	// valid
		// double mat[][];		// valid
		// int [] table [];	// valid

		// String [3][4] str;	// invalid
		// double mat [3][];	// invalid
		// int [0] table [0];	// invalid

		int arr[][] = {{3,4,5,1},{7,2,6},{2,8}};   // valid

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println();
		}

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println();
		}
		
		// System.out.println(arr.length);		// rows - 3
		// System.out.println(arr[0].length);	// column - 4
		// System.out.println(arr[1].length);	// column - 3
		// System.out.println(arr[2].length);	// column - 2

		
	}
}