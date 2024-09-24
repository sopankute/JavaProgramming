import java.io.*;
import java.util.*;

public class FileOutputStreamDemo{
	public static void main(String[] args) throws Exception{

		FileOutputStream fout = new FileOutputStream("abc.txt");

		String str = "Java is not a pure object oriented programming language";

		byte b[] = str.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("File written successfully.....");
	}
}