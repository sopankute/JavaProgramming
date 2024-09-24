import java.io.*;
import java.util.*;

// Question 7

public class SumOfObj{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int sum = x + y;
		System.out.println("sum of number : "+sum);
	}
}
/*
OUTPUT :
C:\Users\Admin\Desktop\Java Programming\Assingnment-2>javac SumOfObj.java

C:\Users\Admin\Desktop\Java Programming\Assingnment-2>java SumOfObj 13 29
sum of number : 42
*/