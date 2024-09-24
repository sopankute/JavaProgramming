import java.io.*;
import java.util.*;

// Question 12
public class ArraySize{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		try{
		if(size < 0)
			throw new NegativeArraySizeException("Enter valid size of array.");
		else
			System.out.println("you enter a valid size of array.");
		}
		catch(NegativeArraySizeException e){
			e.printStackTrace();
		}
	}
}