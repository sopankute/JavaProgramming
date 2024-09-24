import java.io.*;
import java.util.*;

public class Exception2{
	public static void main(String[] args){

		try{
			System.out.print("Type an integer: ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s =br.readLine();
			System.out.println("You typed in..." + s);
			int num = Integer.parseInt (s);
			System.out.println("Converted to an integer..." + num);			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}