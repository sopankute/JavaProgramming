import java.io.*;
import java.util.*;

// Question 26

public class SumOfArray{
	public void sum(int...arr){
		int result = 0;
		for(int element : arr)
			result += element;

		System.out.println(result);
	}
	public static void main(String[] args){
		int[] array = new int[10];
		int i;
		for(i=0; i<array.length; i++){
			array[i] = (int)(1+Math.random()*9);
		}
		for(int e : array){
			System.out.print(e+"  ");
		}
		SumOfArray s = new SumOfArray();
		System.out.print("\nThe sum of All Elements : ");
		s.sum(array);
		int l = array.length;

		int result=0;
		for(i=0; i<l-5; i++){
			result += array[i];
		}
		System.out.println("The sum of First 5 Elements : "+result);
		int add=0;
		for(i=l-5; i<l; i++){
			add += array[i];
		}
		System.out.println("The sum of Last 5 Elements : "+add);
		
	}
}
/*
OUTPUT :
					4  9  6  8  9  2  3  4  9  8
					The sum of All Elements : 62
					The sum of First 5 Elements : 36
					The sum of Last 5 Elements : 26
*/