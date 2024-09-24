import java.io.*;
import java.util.*;

// Question 7
public class ZodiacSign{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Date : ");
		int day = sc.nextInt();
		System.out.print("Enter the month : ");
		int month = sc.nextInt();
		
		if(month == 1)
		{
			if(day<20)
				System.out.println("Zodiac sign for Jan "+day+" Capricorn.");
			else
				System.out.println("Zodiac sign for Jan "+day+" Aquarius.");
		}
		else if(month == 2)
		{
			if(day<19)
				System.out.println("Zodiac sign for Feb "+day+" Aquarius.");
			else
				System.out.println("Zodiac sign for Feb "+day+" Pisces.");
		}
		if(month == 3)
		{
			if(day<21)
				System.out.println("Zodiac sign for March "+day+" Pisces.");
			else
				System.out.println("Zodiac sign for March "+day+" Aries.");
		}
		else if(month == 4)
		{
			if(day<20)
				System.out.println("Zodiac sign for April "+day+" Aries.");
			else
				System.out.println("Zodiac sign for April "+day+" Taurus.");
		}
		if(month == 5)
		{
			if(day<21)
				System.out.println("Zodiac sign for May "+day+" Taurus.");
			else
				System.out.println("Zodiac sign for May "+day+" Gemini.");
		}
		else if(month == 6)
		{
			if(day<21)
				System.out.println("Zodiac sign for June "+day+" Gemini.");
			else
				System.out.println("Zodiac sign for June "+day+" Cancer.");
		}
		if(month == 7)
		{
			if(day<23)
				System.out.println("Zodiac sign for July "+day+" Cancer.");
			else
				System.out.println("Zodiac sign for July "+day+" Leo.");
		}
		else if(month == 8)
		{
			if(day<23)
				System.out.println("Zodiac sign for Augast "+day+" Leo.");
			else
				System.out.println("Zodiac sign for Augast "+day+" Virgo.");
		}
		if(month == 9)
		{
			if(day<23)
				System.out.println("Zodiac sign for Saptember "+day+" Virgo.");
			else
				System.out.println("Zodiac sign for Saptember "+day+" Libra.");
		}
		else if(month == 10)
		{
			if(day<23)
				System.out.println("Zodiac sign for Octomber "+day+" Libra.");
			else
				System.out.println("Zodiac sign for Octomber "+day+" Scorpio.");
		}
		if(month == 11)
		{
			if(day<22)
				System.out.println("Zodiac sign for November "+day+" Scorpio.");
			else
				System.out.println("Zodiac sign for November "+day+" Sagittarius.");
		}
		else if(month == 12)
		{
			if(day<22)
				System.out.println("Zodiac sign for December "+day+" Sagittarius.");
			else
				System.out.println("Zodiac sign for December "+day+" Capricorn.");
		}

	}
}
/*
OUTPUT :
Enter the Date : 26
Enter the month : 6
Zodiac sign for June 26 Cancer.

Enter the Date : 7
Enter the month : 9
Zodiac sign for Saptember 7 Virgo.
*/