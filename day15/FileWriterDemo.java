import java.io.*;
import java.util.Scanner;

public class FileWriterDemo {
	public static void main(String[] args) throws Exception{
		
		FileWriter fw = new FileWriter("xyz.txt", true);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter text");
		char ch;
		int i = 0;
		String str = scanner.nextLine(); //input string

		//sumulate reading char-by-char with charAt()
		while((ch = str.charAt(i)) != 'Z') {
			fw.write(ch);
			i++; //next char
		}

		fw.close();

		System.out.println("File written successfully!");
	}	
}