import java.io.*;
import java.util.*;

public class BufferedOutputStreamDemo{
	public static void main(String[] args) throws IOException{

		FileOutputStream fout = new FileOutputStream("abc2.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);

		String str = "Java has interpreter as well as compiler";
		byte b[] = str.getBytes();
		bout.write(b);

		bout.flush();
		bout.close();
		System.out.println("File write Successfully....");
	}
}