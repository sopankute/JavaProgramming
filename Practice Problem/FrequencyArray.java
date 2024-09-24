import java.util.*;

public class FrequencyArray{
	public static void main(String[] args) {

		 int arr[] = new int[]{1,2,8,3,2,1,5,2,2};
		 // int freq[] = new int[arr.length];

		 int i, key,count = 0;
		 System.out.print("Original Array : ");
		 for(int e : arr)
		 	System.out.print("  "+e);

		 System.out.print("\nEnter number to know Frequency of presence : ");
		 Scanner sc = new Scanner(System.in);
		 key = sc.nextInt();

		 for(i=0; i<arr.length; i++){
		 	if(key == arr[i]){
		 		count++;
		 	}
		 }
		 System.out.println("\nFrequency : "+count);
	}
	
}

// output : 
// Original Array :   1  2  8  3  2  1  5  2  2
// Enter number to know Frequency of presence : 2

// Frequency : 4

// Original Array :   1  2  8  3  2  1  5  2  2
// Enter number to know Frequency of presence : 1

// Frequency : 2

