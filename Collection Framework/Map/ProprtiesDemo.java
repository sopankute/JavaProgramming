import java.util.*;
import java.io.*;

public class ProprtiesDemo{
	public static void main(String[] args) throws Exception{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");

		p.load(fis);			   //  load all properties from properties file into java properties obj
		System.out.println(p);

		String s = p.getProperty("Venky");
		System.out.println(s);

		p.setProperty("Nagpur", "8888");
		FileOutputStream fos = new FileOutputStream("abc.properties");

		p.store(fos,"Updated by durga for scjp demo class");	// load all properties from java properties into properties file obj
	}
}

// output :
// {Venky=9999, pwd=tiger, user=scott}
// 9999
// after user updated
// {Venky=9999, Nagpur=8888, pwd=tiger, user=scott@123}
// 9999

// abc.properties 
// #Updated by durga for scjp demo class
// #Sat Jun 04 09:06:46 IST 2022
// Venky=9999
// Nagpur=8888
// pwd=tiger
// user=scott

