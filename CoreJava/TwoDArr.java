import java.io.*;
import java.util.*;

public class TwoDArr{
	public static void main(String[] args){

	//	Print 1st and last row

		int[][] arr = {{4,9},{3,7},{6,2}};

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(i==0 || i==arr.length-1)      // condition
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	//	Print 1st and last row	
		// int[][] arr1 = {{4,9,1},{2,7,5},{6,3,8}};

		// for(int i=0; i<arr1.length; i++)
		// {
		// 	for(int j=0; j<arr1[i].length; j++)
		// 	{
		// 		if(i==0 || i==arr1.length-1)      // condition
		// 		System.out.print(arr1[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }

	//  Border elements of the Square

		// int[][] arr2 = {{4,9,1},{2,7,5},{6,3,8}};

		// for(int i=0; i<arr2.length; i++)
		// {
		// 	for(int j=0; j<arr2[i].length; j++)
		// 	{
		// 		    // 1st and last row 	   // 1st and last column

		// 		if((i==0 || i==arr2.length-1)||(j==0 || j==arr2[i].length-1))
		// 			System.out.print(arr2[i][j]+" ");
		// 		else
		// 			System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }	

	//  Print Diagonal elements of an Array
	
		// int[][] arr3 = {{4,9,1},{2,7,5},{6,3,8}};

		// for(int i=0; i<arr3.length; i++)
		// {
		// 	for(int j=0; j<arr3[i].length; j++)
		// 	{
		// 		if(i==j || i+j==arr3.length-1)
		// 			System.out.print(arr3[i][j]+" ");
		// 		else
		// 			System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }	


	// 	int[][] arr4 = {{4,9,1},{2,7,5},{6,3,8}};

	// 	for(int i=0; i<arr4.length; i++)
	// 	{
	// 		for(int j=0; j<arr4[i].length; j++)
	// 		{

	// //  Print elements below the major Diagonal 	
	// 			if(i>=j)
	// 				System.out.print(arr4[i][j]+" ");
	// 			else
	// 				System.out.print("  ");

	// //  Print elements above the major Diagonal	
	// 			// if(i<=j)
	// 			// 	System.out.print(arr4[i][j]+" ");
	// 			// else
	// 			// 	System.out.print("  ");		

	// 		}
	// 		System.out.println();
	// 	}	


	//  Print all Even elements 
	
		// int[][] arr5 = {{4,9,1},{2,7,5},{6,3,8}};

		// for(int i=0; i<arr5.length; i++)
		// {
		// 	for(int j=0; j<arr5[i].length; j++)
		// 	{
		// 		if(arr5[i][j]%2 == 0)
		// 			System.out.print(arr5[i][j]+" ");
		// 		else
		// 			System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }		

	}
}