import java.io.*;
import java.util.*;

public class Practice_4{

	static void change(int x){
		x = 97;
	}

	static void change2(int[] arr){
		arr[0] = 97;
	}
	public static void main(String[] args){
		
		int x = 45;
		change(x);
		System.out.println("the value of x after change() : "+x);	// 45

		int[] marks = {34, 45, 56, 67, 78};
		change2(marks);
		System.out.println("the value at marks[0] : "+marks[0]);	// 97


	}
}