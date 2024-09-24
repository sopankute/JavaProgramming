import java.io.*;

public class FileIO2{

	public static void main(String[] args) throws Exception{
		File f = new File("durga");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}
}
// output 1st time :

// false
// true

// output 2nd time :

// true
// true