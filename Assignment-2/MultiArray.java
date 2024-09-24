import java.io.*;
import java.util.*;

// Question 24

public class MultiArray{
	public void oneD(){
		int[] arr = new int[10];
		for(int i=0; i<10; i++){
			arr[i] = (int)(9 + Math.random()*90);
		}
		this.showArray(arr);
	}
	public void showArray(int[] array){
		for(int i=0; i<10; i++){
			System.out.print(array[i]+"  ");
		}
		System.out.println("\nLength of One-D Array : "+array.length);
	}

	public void twoD(){
		int[][] arr = new int[4][5];
		for(int i=0; i<4; i++){
			for(int j=0; j<5; j++){
			arr[i][j] = (int)(9 + Math.random()*90);
			}
		}
		this.dispArray(arr);
	}

	public void dispArray(int[][] array){
		int i, j;
		for(i=0; i<array.length; i++){
			for(j=0; j<array[i].length; j++){
			System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("\nNumber of Rows One-D Array : "+array.length);
		System.out.println("Number of Column One-D Array : "+array[i-1].length);
	}
	public static void main(String[] args){
		MultiArray m = new MultiArray();
		m.oneD();
		System.out.println();
		m.twoD();
	}	
}
/*
OUTPUT :
					67  33  22  25  41  32  29  14  83  50
					Length of One-D Array : 10

					83  26  28  18  93
					14  67  60  92  22
					67  70  55  91  89
					50  28  77  78  77

					Number of Rows One-D Array : 4
					Number of Column One-D Array : 5
*/