import java.io.*;
import java.util.*;

// Question 31.a

public class Exception1{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);	
		int[] arr = new int[5];
		arr[0] = 11;
		arr[1] = 13;
		arr[2] = 15;
		arr[3] = 17;
		arr[4] = 19; 
		System.out.print("Enter the index of num you want to divide : ");
		int ind = sc.nextInt();
		System.out.print("Enter num to divide : ");
		int num = sc.nextInt();

		try{
			int x = arr[ind] / num;
		}
		catch(ArithmeticException e){
			System.out.println("You can't divide any number by Zero.");
			System.out.println(e);
			e.printStackTrace();	// indicate on which line exception is getting occurred
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter a valid index number.");
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("Other type of Exception is Occurred.");
			System.out.println(e);
		}
	}
}
/*
OUTPUT :
		Exception 1 :
			Enter the index of num you want to divide : 4
			Enter num to divide : 0
			You can't divide any number by Zero.
			java.lang.ArithmeticException: / by zero
			java.lang.ArithmeticException: / by zero
			        at Exception1.main(Exception1.java:22)

		Exception 2 :
			Enter the index of num you want to divide : 6
			Enter num to divide : 3
			Please enter a valid index number.
			java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
							        
*/