import java.io.*;
import java.util.*;

// Question 37

public class StringClass1{
	public static void main(String[] args){

		String s = "Java Programming";

		System.out.println(s.length());					// 16
		System.out.println(s.charAt(5));				// P
		System.out.println(s.substring(8));				// gramming
		System.out.println(s.substring(8, 12));			// gram
		System.out.println(s.indexOf("Programming"));	// 5

		String str1 = "Core";							
		String str2 = "-Java";										
		System.out.println(str1.concat(str2));				// Core-Java
		System.out.println(str1.equals("core"));			// false
		System.out.println(str1.equalsIgnoreCase("core"));	// true
		System.out.println(str1.equals("Core"));			// true

		String str3 = " Core Java ";
		System.out.println(str1.compareTo(str3));			// 35
		System.out.println(str3.toLowerCase());				// core java
		System.out.println(str3.toUpperCase());				// CORE JAVA
		System.out.println(str3.trim());					// Core Java

	}
}
/*
OUTPUT :
					16
					P
					gramming
					gram
					5
					Core-Java
					false
					true
					true
					35
					core java
					CORE JAVA
					Core Java
*/