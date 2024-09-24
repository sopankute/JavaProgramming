import java.io.*;
import java.util.*;

public class CompareArr{
	public static void main(String[] args)
	{
		int[] arr1 = { 3, 6, 9, 5};
		int[] arr2 = { 3, 6, 9, 5};

		if(arr1 == arr2)
			System.out.println("Both Same");
		else
			System.out.println("Both Not same");   // Ans

		if(Arrays.equals(arr1,arr2))
			System.out.println("Both Same");       // Ans
		else
			System.out.println("Both Not same");

		if(arr2.equals(arr1))
			System.out.println("Both Same");
		else
			System.out.println("Both Not same");       // Ans	 

	}
}