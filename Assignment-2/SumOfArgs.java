import java.io.*;
import java.util.*;

//Question 19

public class SumOfArgs{
	public static void main(String[] args) {
		
		int i, count = 0, sum=0;
		for(i=0; i<args.length; i++){
			try{
				sum += Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e){
				// System.out.print("Invalid Integers : ");
				count++;
			}
		}
		System.out.println("Sum of Args Integers : "+sum);
		System.out.print("Invalid Integers : "+count);
	}
}