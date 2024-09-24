import java.io.*;
import java.util.*;

public class BufferedInputStreamDemo{
	public static void main(String[] args) throws IOException{

		FileInputStream fin = new FileInputStream("BufferedInputStreamDemo.java");
		BufferedInputStream bin = new BufferedInputStream(fin);

		int i=0;
		while((i=bin.read())!= -1){
			System.out.print((char)i);
		}

		fin.close();
		System.out.println("\nFile write Successfully....");
	}
}