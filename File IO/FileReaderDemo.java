import java.io.*;

public class FileReaderDemo{
	public static void main(String[] args) throws IOException{

		FileReader fr = new FileReader("FileReaderDemo.java");
		int i = fr.read();

		while(i != -1){
			System.out.print((char)i);
			i = fr.read();
		}
		
	}
}