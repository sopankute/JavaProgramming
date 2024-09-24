import java.io.*;

public class FWDemo {
	public static void main(String[] args) throws Exception{
		
		// File f = new File("abc.txt"); //file abc.txt

		FileWriter fw = new FileWriter("abc.txt", true); // true -> appending

		String str = "\n Java is #1 development platform";

		fw.write(str);

		fw.close();

		System.out.println("File written successfully");
	}
}