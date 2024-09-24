import java.io.*;
import java.util.*;

// Question 39

public class WrapperClass{
	public static void main(String[] args){

	 // WrapperType.valueOf(String s);
		Integer i = Integer.valueOf(23);
		System.out.println(i);				// 23

		Double d = Double.valueOf("57.34");
		System.out.println(d);				// 57.34

		Boolean b = Boolean.valueOf(true);
		System.out.println(b);				//true


	 // WrapperType.valueOf(primitive p);
		Character ch = Character.valueOf('c');
		System.out.println(ch);					// c


	 // Wrapper.valueOf(String s, int radix)
		Integer i1 = Integer.valueOf("10110", 2);
		System.out.println(i1);						// 22

		Integer i2 = Integer.valueOf("1011", 8);
		System.out.println(i2);						// 521


	 // primitive.parseXxx(String s);
		float f = Float.parseFloat("75.43f");
		System.out.println(f);						// 75.43

		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1);						// true


	 // primitive.parseXxx(String s, int radix);
		int i3 = Integer.parseInt("1101", 2);
		System.out.println(i3);						// 13
		long l = Long.parseLong("0110", 4);
		System.out.println(l);						// 20

	//  toString();	

		Integer i4 = new Integer(43);
		String str = i4.toString();
		System.out.println(str);					// 43

	//  toString(primitive p);	
		String str1 = Integer.toString(93);
		System.out.println(str1);					// 93

		String str2 = Character.toString('a');
        System.out.println(str2);					// a
	}
}