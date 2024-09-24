import java.io.*;
import java.util.*;

// Question 5

abstract class AddClass{
	abstract void sum1();
	abstract void sum2();
}
public class AbstractSum extends AddClass{

	void sum1(){
		int num1 = 13, num2 = 28;
		System.out.println(num1 + num2);
	}
	void sum2(){
		double num1 = 23.43, num2 = 45.67;
		System.out.println(num1 + num2);
	}
		public static void main(String[] args){
			AbstractSum as = new AbstractSum();
			as.sum1();
			as.sum2();
		}
}
/*
			OUTPUT : 
			41
			69.1
*/