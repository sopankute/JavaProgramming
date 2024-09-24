package day02;

//Command line arguments examples

import java.util.Arrays; //used for sorting an array in [4]

public class UserInput {

	public static void main(String[] args) { //JVM calls First.main()

//[1]read and print your name without using any classes etc.
/*
		System.out.println("My name is: "+ args[0]);
		System.out.println("I'm from: "+ args[1]);
		System.out.println("My twitter handle is: @"+ args[2]);
*/

//[2]Converting string to integer
/*
	//if we try:
		System.out.println("sum: "+ (args[0]+args[1])); 
	//this will return concatenated string, not the sum of two
	//numbers because the array args[] is of type String

	//Hence we first need to convert string -> integer
		int a = Integer.parseInt(args[0]); //"20" to 20
		int b = Integer.parseInt(args[1]); //"30" to 30

		int sum = a+b; //20+30

		System.out.println("intended sum: "+sum); //50
*/

//[3]Program to read random number of integers/any numbers and find the sum of all those numbers
/*
		int sum = 0;

		//The challenge is we don't know how many elements did the
		//user input as arguments. Since args is an array, we can
		//fetch the size of the array using args.length
		for(int i=0 ; i < args.length ; i++)		
		{
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(sum);
*/

//[4]Input city names and print them in alphabetical order
/*
		System.out.println("Entered list of cities:");
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]);
		}

		System.out.println("\nSorted list of cities:");
		Arrays.sort(args); // sorts ascending in order (here, alphabetically)

		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]);
		}
*/
	}

}