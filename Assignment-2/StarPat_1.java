import java.io.*;
import java.util.*;

// Question 2.1

public class StarPat_1{
	
	public static void drawPattern(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value : ");
		int n = sc.nextInt();

		drawPattern(n);

	}
}
/*
OUTPUT :
                 enter the value : 5
				 *  *  *  *  *
				 *  *  *  *  *
				 *  *  *  *  *
				 *  *  *  *  *
				 *  *  *  *  *
 */