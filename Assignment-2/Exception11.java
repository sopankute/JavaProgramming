import java.io.*;
import java.util.*;

// Question 33.b

public class Exception11{

	public static int show(int[] array) throws ArrayIndexOutOfBoundsException{
		return array[6] = 13;
	}
	public static void main(String[] args){

		int[] arr = {1, 9, 3, 7, 5, 3};
		try{
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException is Occurred\n");
			System.out.println(e+"\n");
			e.printStackTrace();
		}
	}
}