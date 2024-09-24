import java.io.*;
import java.util.*;

// Question 16 and 17
public class Time{
	
	int hr;
	int min;
	int sec;

	public void userInput(){
		// this.hours = hr;
		// this.minutes = min;
		// this.seconds = sec;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Time As - Hr : Min : Sec - ");
		 hr = sc.nextInt();
		 min = sc.nextInt();
		 sec = sc.nextInt(); 

	}
	public void dispTime(){
		System.out.println("Time - "+hr+":"+min+":"+sec);
	}
	public static void main(String[] args){

		Time t = new Time();
		t.userInput();
		t.dispTime();
		

		// int hr = sc.nextInt();
		// int min = sc.nextInt();
		// int sec = sc.nextInt();

	}
}