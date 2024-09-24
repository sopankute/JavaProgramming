import java.io.*;

public class FileIO1{

	public static void main(String[] args) throws Exception{
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}
}

// output 1st time :

// false
// true

// output 2nd time :

// true
// true