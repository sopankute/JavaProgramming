import java.util.Scanner;
import java.io.*;

// Question 10

public class GetString{
	public static void main(String... args){
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter String : ");
		// String str = sc.nextLine();

		String str = " GeeksFor Geeks ";

		String str1 = new String("Java Programming");

		String str2 = " geeksFor geeks ";
		
		System.out.println(str.length());      // 16

		System.out.println(str.toLowerCase());	//  geeksfor geeks

		System.out.println(str.toUpperCase());	//  GEEKSFOR GEEKS

		// System.out.println(str.charAt(6));     // F

		// System.out.println(str.substring(3));      // eksFor Geeks

		// System.out.println(str.substring(3, 8));   // eksFo

		// System.out.println(str.concat(str1));      //  GeeksFor Geeks Java Programming

		// System.out.println(str.indexOf("Geeks"));       // 1
		
		// System.out.println(str.lastIndexOf("Geeks"));   // 10

		// System.out.println(str.lastIndexOf("k"));       // 13

		// System.out.println(str.indexOf("sF"));	        // 5

	    // System.out.println(str1.indexOf("mi", 2));      // 12

	    // System.out.println(str.equals(" geeksfor geeks "));             // False

		// System.out.println(str.equalsIgnoreCase(" geeksfor geeks "));	// True

		// System.out.println(str.compareTo(str1));	// -ve		    

		// System.out.println(str.compareTo(str2));	// -ve

		// System.out.println(str.compareTo(" GeeksFor Geeks "));   // 0 (Positive)

		// System.out.println(str.compareToIgnoreCase(str2));		    // 0

		// System.out.println(str.replace('G', 'L'));       //  LeeksFor Leeks

		// System.out.println(str.replace(" ", "_"));	// _GeeksFor_Geeks_

		// System.out.println(str.trim());  // remove whitespaces at both of end
	}
}