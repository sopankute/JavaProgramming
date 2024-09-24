import java.util.Scanner;

// Question 8

public class IntArray{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		int i, n, sum=0;
		System.out.print("Enter the number of elements you want to store : ");
		n = sc.nextInt();

		System.out.print("Enter array Elements : ");
		for(i=0; i<n; i++){
		   array[i] = sc.nextInt();
		}

		array[2] = -7;
		System.out.println("After Update : "+array[2]); 	// Replaced 3rd Array element by -7

		// int temp;
			// temp = array[0];			// Valid
			// array[0] = array[n-1];
			// array[n-1] = temp;

		for(i=0; i<n; i++)
		{
		    int temp = array[0];
			array[0] = array[n-1];
			array[n-1] = temp;
		}

		for(i=0; i<n; i++)						 //  0  1  2  3  4
			System.out.print("  "+array[i]);	 // 125 8 -7 64  1   Replace 1st and 5th elements
			   					
		int result = (array[1] - array[2]);
		array[3] = result;
	
		System.out.println();
	    for(i=0; i<n; i++)					//   0  1  2  3  4
		System.out.print("  "+array[i]);	//  125 8 -7  15 1       After subtraction [2nd - 3rd] elements

		for(i=1; i<n-1; i++)
			sum += array[i];

		System.out.println();
		System.out.println("Sum 1-3 : "+sum);  // sum of [ 1st + 2nd + 3rd] elements

		for(i=0; i<n; i++){
			System.out.print(" "+array[i]);
		}
	}
}