import java.io.*;
import java.util.*;

public class CloneArr{
	public static void main(String[] args)
	{
		// 1-D Array clonning
		// Deep Copy is created for one-dimensíonal array by clone() method

		int[] intArray = {7, 2, 6, 4, 9, 3};

		int[] cloneArray = intArray.clone();

		System.out.println(cloneArray == intArray);  // false

		for(int i=0; i<cloneArray.length; i++)
			System.out.print(cloneArray[i]+" ");    // 7 2 6 4 9 3

		// multi-D Array clonning
		// Shallow Copy is created for one-dimensíonal array by clone() method

		int[][] intArr = {{3, 4, 5},{7, 9}};

		int[][] cloneArr = intArr.clone();

		System.out.println(intArr == cloneArr);      // false

		System.out.println(intArr[0] == cloneArr[0]);    // True
        System.out.println(intArr[1] == cloneArr[1]);	 // True
	}
}