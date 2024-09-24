import java.io.*;
import java.util.*;

// Star Pattern using Recursion

public class Practice_7{

	static void starPat(int n){
		if(n>0)
		{	
			starPat(n-1);
			for(int i=0; i<n; i++)
				System.out.print(" * ");
		}
		System.out.println();
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the vlaue of n : ");
		int x = sc.nextInt();
		starPat(x);

	}
}