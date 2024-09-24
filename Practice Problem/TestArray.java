import java.util.*;

public class TestArray{
	public static void main(String[] args) {
		
		// int [] arr = {3, 6, 2, 1, 5};
		String [] arr = {"Sopan","Bhushan","Ashish","Nitin","Shreyash"};
		String temp;
		int i, j;

		System.out.print("Original Array : ");
		for(String element : arr)
			System.out.print("  "+element);

		System.out.print("\nNo of times Array rotate towards left : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(i=0; i<n; i++){

			temp = arr[0];
			for(j=0; j<arr.length-1; j++){
				arr[j] = arr[j+1];
			}
			// here j will be at index of 4 so assign temp to j'th index 
			arr[j] = temp;
		}

		System.out.print("Array After left rotation : ");
		for(String element : arr)
			System.out.print("  "+element);
	}
}
// output 1: 
// Original Array :   3  6  2  1  5
// No of times Array rotate towards left : 2
// Array After left rotation :   2  1  5  3  6

// output 2:
// Original Array :   Sopan  Bhushan  Ashish  Nitin  Shreyash
// No of times Array rotate towards left : 2
// Array After left rotation :   Ashish  Nitin  Shreyash  Sopan  Bhushan
