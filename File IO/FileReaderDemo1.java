import java.io.*;


public class FileReaderDemo1{
	public static void main(String[] args) throws IOException {

		File f = new File("FileReaderDemo1.java");
		// System.out.println(fr.length());		// 189 - length() is a long type method

		int size = (int)f.length();
		char[] ch = new char[size];

		FileReader fr = new FileReader(f);
		fr.read(ch);

		for(char c : ch)
			System.out.print(c);
	}
}