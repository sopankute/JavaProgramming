import java.io.*;
import java.util.*;

//  Question 1

public class SortArray{
	public static void printArray(int[] array){
		for( int e : array)
			System.out.print(e+"  ");
	}
	public static void sorting(int[] array){
		int i, j, temp = 0;
		for(i=0; i<array.length; i++){
			for(j=i+1; j<array.length; j++)
			{ 
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args){
		
		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of Elements you want to entered : ");
		n = sc.nextInt();
		int max = -90;
		int min = 90;
		int[] arr = new int[n];
		// Random random = new Random();
		for(i=0; i<arr.length; i++){
			arr[i] = (int)(9+Math.random()*90);
			// int number = random.nextInt(max - min) + min;	// -ve to +ve 
			// arr[i] = random.nextInt(max - min) + min;
		}
		System.out.println("Before Sorting ");
		System.out.print("Array elements : ");
		printArray(arr);
		sorting(arr);
		System.out.println("\n\nAfter Sorting ");
		System.out.print("Array elements : ");
		printArray(arr);

	}
}
/*
			OUTPUT :
			Enter no of Elements you want to entered :9
			Array elements : 44  34  44  27  32  88  27  61  94
			After String : 27  27  32  34  44  44  61  88  94
*/
