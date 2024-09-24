import java.io.*;
import java.util.*;

// Question 3

public class NumPattern{
	public static void main(String[] args){
		int n=4,a;
		for(int i=n; i>=1; i--){
			if(i!=1){	
				if(i%2 == 0){
					a = (i*(i+1))/2;
					for(int j=1; j<=i; j++)
						System.out.print(a-- +" ");
				}
				else{
					a = n;
					for(int j=1; j<=i; j++)
						System.out.print(a++ +" ");
				}
			System.out.println();
			}
			else{
				System.out.println(i);
			}
		}
	}
}