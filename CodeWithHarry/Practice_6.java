import java.io.*;
import java.util.*;

public class Practice_6{

	// static int sum(int...arr){}
	static int sum(int x, int...arr){ 
		int result = 0;
		for(int e : arr){
			result += e;
		}
		return result;
	}

	public static void main(String[] args){

		// System.out.println("the sum of two number : "+sum());	 // 0
		System.out.println("the sum of two number : "+sum(2));	 // 2
		System.out.println("the sum of two number : "+sum(2,3));
		System.out.println("the sum of three number : "+sum(2,3,4));
		System.out.println("the sum of four number : "+sum(2,3,4,5));
		System.out.println("the sum of five number : "+sum(2,3,4,5,6));
	}
}