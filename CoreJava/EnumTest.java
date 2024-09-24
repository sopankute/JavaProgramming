import java.io.*;
import java.util.*;

enum Days{
	MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class EnumTest{
	Days day;
	public EnumTest(Days day){
		this.day = day;
	}

	public void daysOfWeak(){

		switch(day)
		{
		case MON :
			System.out.println("C-Programming");
			break;
		case TUE :
			System.out.println("Cpp Programming");
			break;
		case WED :
			System.out.println("Core-Java");
			break;
		case THU :
			System.out.println("Java-Script");
			break;
		case FRI :
			System.out.println("Python");
			break;
		case SAT :
			System.out.println("React-js");
			break;
		case SUN :
			System.out.println("HTML-CSS");
			break;
		}
	}

	public static void main(String args[])
	{
		EnumTest first = new EnumTest(Days.WED);	// Core Java
		first.daysOfWeak();

		Days d[] = Days.values();
		for(Days e : d)
			System.out.print(e+"  ");	// MON  TUE  WED  THU  FRI  SAT  SUN



	}
}