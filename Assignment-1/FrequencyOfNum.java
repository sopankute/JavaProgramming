import java.io.*;
import java.util.Scanner;

//Question 14

public class FrequencyOfNum{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The total number of elements : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter the Elements : ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter number to know Frequency : ");
		int key = sc.nextInt();
		int freq = 0;

		for(int i=0; i<n; i++)
		{
			if(key == arr[i])
				freq++;
		}
		System.out.println(key+" is the Number presented for "+freq+" times");
	}
}

// OUTPUT:
// Enter The total number of elements : 8
// Enter the Elements : 7 4 2 7 4 7 1 7
// Enter number to know Frequency : 7
// 7 is the Number presented for 4 times