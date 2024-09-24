import java.io.*;
import java.util.*;

// Question 30

public class CallBy{
	int num = 15;
	public void meth1(int num){
		num += 10;
	}
	public void meth2(CallBy cbr){
		num += 20;
	}
	public static void main(String[] args){
	//  Call By Value
		CallBy cbv = new CallBy();
		System.out.println("Call By Value ");
		System.out.println("value of Num before calling meth1 : "+cbv.num);	// 15
		cbv.meth1(20);
		System.out.println("value of Num after calling meth1 : "+cbv.num+"\n");	// 15 - doesn't change original value of num

	//  Call By Reference
		CallBy cbr = new CallBy();
		System.out.println("Call By Reference ");
		System.out.println("value of Num before calling meth1 : "+cbr.num);	// 15
		cbr.meth2(cbr);
		System.out.println("value of Num after calling meth1 : "+cbr.num);	// 35 - change original value of num
	} 
} 