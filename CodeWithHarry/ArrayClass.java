import java.io.*;
import java.util.*;

public class ArrayClass{
	public static void main(String args[])
	{

		// float[] arr = {76.23f, 37.62f, 76.37f, 13.74f, 86.23f, 54.23f};
		// float sum = 0;
		// for(float element : arr){
		// 	 sum += element;
		// }
		// System.out.println("Average : "+sum/arr.length);


		// float[] arr = {76.23f, 37.62f, 76.37f, 13.74f, 86.23f, 54.23f};
		// float key = 76.23f;
		// boolean isPresent = false;
		// for(float element : arr){
		// 	 if(key == element){
		// 	 	isPresent = true;
		// 	 	break;
		// 	 }
		// }
		// if(isPresent)
		// 	System.out.println("Present");
		// else
		// 	System.out.println("Not Present");


		// int[][] mat1 = {{7,3,3},{2,5,7}};
		// int[][] mat2 = {{6,5,4},{8,7,3}};
		// int[][] result = {{0,0,0},{0,0,0}};

		// for(int i=0; i<mat1.length; i++){
		// 	for(int j=0; j<mat1[i].length; j++){
		// 		result[i][j] = mat1[i][j] + mat2[i][j];
		// 		System.out.print(result[i][j]+"   ");
		// 	}
		// 	System.out.println();			
		// }


		// int[] arr = {2,3,4,5,6,7,8};
		// int l = arr.length;
		// int a = Math.floorDiv(l,2);
		// int temp = 0;
		// for(int i=0; i<=a; i++)
		// {
		// 	temp = arr[i];
		// 	arr[i] = arr[l-i-1];
		// 	arr[l-i-1] = temp;
		// }
		// for(int e : arr)
		// 	System.out.print(e+"  ");


		// int[] arr = {76, 37, 76, 13, 86, 54};
		// // int max = Integer.MIN_VALUE;
		// int max = 0;
		// for(int e : arr){
		// 	if(e>max){
		// 		max = e;
		// 	}
		// }
		// System.out.println(max);


		// int[] arr = {76, 37, 76, 13, 86, 54};
		// int min = Integer.MAX_VALUE;
		// for(int e : arr){
		// 	if(e<min){
		// 		min = e;
		// 	}
		// }
		// System.out.println(min);

		int[] arr = {76, 37, 76, 13, 86, 54};
		boolean isSort = true;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]<arr[i+1]){
				isSort = false;
				break;
			}
		}
		if(isSort)
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
	}
}