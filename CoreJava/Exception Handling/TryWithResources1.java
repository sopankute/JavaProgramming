import java.io.*;
import java.util.*;

public class TryWithResources1{
	public static void main(String[] args) throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.print("Enter name : ");
			String name = br.readLine();
			System.out.print("Enter age : ");
			int age = Integer.parseInt(br.readLine());

			System.out.println(name+"\t"+age);
		}
		// catch(Exception e){
		// 	System.out.println(e);
		// }
	}
}
// output 1:
// 			Enter name : Sopan
// 			Enter age : 24
// 			Sopan   24
// ouput 2:
// 			Enter name : Sopan
// 			Enter age : 24 yr
// 			Exception in thread "main" java.lang.NumberFormatException: For input string: "24 yr"
// 			        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
// 			        at java.base/java.lang.Integer.parseInt(Integer.java:668)
// 			        at java.base/java.lang.Integer.parseInt(Integer.java:786)
// 			        at TryWithResources1.main(TryWithResources1.java:10)