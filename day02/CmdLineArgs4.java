//Input city names and print them in alphabetical order
package day02;

import java.util.Arrays; //used for sorting an array

public class CmdLineArgs4 {
    public static void main(String[] args) {
        System.out.println("Entered list of cities:");
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]);
		}

		System.out.println("\nSorted list of cities:");
		Arrays.sort(args); // sorts ascending in order (here, alphabetically)

		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]);
		}
    }
}
