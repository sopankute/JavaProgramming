import java.io.*;
import java.util.*;

public class FileIOStreamDemo{
	public static void main(String[] args) throws IOException{

		FileInputStream fin = new  FileInputStream("FileInputStreamDemo.java");
		FileOutputStream fout = new FileOutputStream("abc1.txt");

		int i=0;
		while((i=fin.read())!= -1){
			fout.write((byte)i);
			System.out.print((char)i);
		}

		fin.close();
		fout.close();
		System.out.println("File read and write Successfully....");
	}
}