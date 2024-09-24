import java.io.*;
import java.util.Scanner;

public class StrArray{
	public static void main(String[] args){

	String[] languages = {"Java", "C", "Python", "JavaScript", "C#", "XML", "SQl", "HTML"};

	for(String str : languages)
		System.out.println(str);

	java.util.Arrays.sort(languages);

	System.out.println("\nSorted Order : ");	

	for(String str : languages)
		System.out.println(str);
   }
}