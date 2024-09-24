import java.io.*;

public class FileIO3{
	public static void main(String[] args) throws IOException {
		File f = new File("durga123");
		f.mkdir();

		File f1 = new File("durga123", "demo.txt");

		File f2 = new File(f, "demo.txt" );

		f1.createNewFile();

		System.out.println(f.exists());
		System.out.println(f1.exists());
		System.out.println(f2.exists());
	}
}