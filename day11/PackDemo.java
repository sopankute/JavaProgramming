//import java.util.*; // implicit import
//import java.sql.*; // implicit import
//^ both have same priority and create ambiguity as both
//the packages have Date class

//import java.util.Date; // explicit import, has highest priority
import java.time.*; // implicit import
//import java.util.*; // implicit import
// the Date.class that we wrote is also used

public class PackDemo {
	public static void main(String[] args) {
	
		java.util.Date d = new java.util.Date(); // util - FQN
		System.out.println(d); //now refers to custom Date class
		//hence it prints the reference address

		LocalDate date = LocalDate.now();
		System.out.println(date);

		Date myDate = new Date();		
		myDate.getDate(); //class path
	}
}