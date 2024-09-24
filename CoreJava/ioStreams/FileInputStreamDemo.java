import java.io.*;
import java.util.*;

public class FileInputStreamDemo{
	public static void main(String[] args) throws IOException{

		// FileInputStream fin = new  FileInputStream("abc.txt");
		FileInputStream fin = new  FileInputStream("FileInputStreamDemo.java");

		int i=0;
		while((i=fin.read())!= -1){
			System.out.print((char)i);
		}
		fin.close();
	}
}