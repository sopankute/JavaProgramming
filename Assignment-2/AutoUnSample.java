import java.util.*;
import java.io.*;

// Question 38

public class AutoUnSample{
	public static void main(String[] args){

		System.out.println("Wrapper Objects ans Wrapper Values ");

//  AutoBoxing
		byte b = 2;
		Byte byteObj = new Byte(b);
		System.out.println("Byte Object :  \t"+byteObj);
//  UnBoxing		
		byte b1 = byteObj;
		System.out.println("Byte Value : \t"+b1+"\n");

//  AutoBoxing
		short sh = 34;
	    Short shortObj = new Short(sh);
	    System.out.println("Short Object : \t"+shortObj);
//  UnBoxing	    
	    short sh1 = shortObj;
	    System.out.println("Short Value : \t"+sh1+"\n");

//  AutoBoxing
		int i = 28;
		Integer intObj = new Integer(i);
		System.out.println("Int Object :    "+intObj);
//  UnBoxing		
		int i1 = intObj;
		System.out.println("Int Value :    "+i1+"\n");

//  AutoBoxing
		long l = 6534364l;
	    Long longObj = new Long(l);
	    System.out.println("Long Object :   "+longObj);
//  UnBoxing	    
	    long l1 = longObj;
	    System.out.println("Long Value :   "+l1+"\n");

//  AutoBoxing
	    float f = 23.234f;
	    Float floatObj = new Float(f);
	    System.out.println("Float Object : \t"+floatObj);
//  UnBoxing	    
	    float f1 = floatObj;
	    System.out.println("Float Value : \t"+f1+"\n");

//  AutoBoxing
	    double d = 76.641;
	    Double doubleObj = new Double(d);
	    System.out.println("Double Object : "+doubleObj);
//  UnBoxing	    
	    double d1 = doubleObj;
	    System.out.println("Double Value : "+d1+"\n");

//  AutoBoxing
	    char c = 'c';
	    Character charObj = new Character(c);
	    System.out.println("Char Object :   "+charObj);
//  UnBoxing	    
	    char c1 = charObj;
	    System.out.println("Char Value :   "+c1+"\n");

//  AutoBoxing
	    boolean flag = true;
	    Boolean booleanObj = new Boolean(flag);
	    System.out.println("Boolean Object : "+flag);
//  UnBoxing	    
	    boolean flag1 = booleanObj;
	    System.out.println("Boolean Value : "+flag1+"\n");
	   
	}
}
/*
OUTPUT : 
			Wrapper Objects ans Wrapper Values
			Byte Object :   2
			Byte Value :    2

			Short Object :  34
			Short Value :   34

			Int Object :    28
			Int Value :    28

			Long Object :   6534364
			Long Value :   6534364

			Float Object :  23.234
			Float Value :   23.234

			Double Object : 76.641
			Double Value : 76.641

			Char Object :   c
			Char Value :   c

			Boolean Object : true
			Boolean Value : true
*/