import java.io.*;
import java.util.*;

public class TryWithResources{
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.print("Enter name : ");
			String name = br.readLine();
			System.out.print("Enter age : ");
			int age = Integer.parseInt(br.readLine());

			System.out.println(name+"\t"+age);
		}
		catch(Exception e){
			System.out.println(e);
		}
		// finally is not required coz resources are autoclosable
	}
}
// output 1: 
// 			Enter name : sopan
// 			Enter age : 24
// 			sopan   24
// output 2:
// 			Enter name : sopan
// 			Enter age : 24 yr
// 			java.lang.NumberFormatException: For input string: "24 yr"

