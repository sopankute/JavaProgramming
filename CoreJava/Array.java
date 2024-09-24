import java.io.*;
import java.util.Scanner;

public class Array{
	public static void main(String[] args){

		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter array Elements : ");
		int[] arr = new int[10];

	//  Random Elements generating

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random()*100);
			// arr[i] = sc.nextInt();
		}

	//  Printing
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");   // 63 98 31 97 86 77 84 61 22 98

		// int sum=0;
		// for(int e:arr)
		// {
		// 	System.out.print(e+" ");   // 7 94 5 52 35 74 31 37 34 93
		// 	sum += e;
		// }
		// System.out.print("\nsum : "+sum);  // sum : 462

	//  To find MAX value
		
		// int min = Integer.MAX_VALUE;
		// int max = Integer.MIN_VALUE;
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
				min = arr[i];

			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("\nMinimum number : "+min);
		System.out.println("Maximum number : "+max);

	}
}