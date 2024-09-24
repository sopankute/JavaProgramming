import java.io.*;
import java.util.*;

// Question 35

public class ObjClass{
	public static void main(String[] args){
		String str = new String("Java");
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "java";
		
//  Reference Operator (==) address comparator
		System.out.println("str == str1 : "+(str == str1));	// false
		System.out.println("str1 == str2 : "+(str1 == str2));	// true
		System.out.println("str2 == str3 : "+(str2 == str3));	// false

//  equals Method - Content comparator
		System.out.println("str.equals(str1) : "+str.equals(str1));	// true
		System.out.println("str2.equals(str3) : "+str2.equals(str3));	// false
	}
}