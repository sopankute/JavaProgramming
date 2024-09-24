import java.io.*;

public class FileIO5{
	public static void main(String[] args) throws IOException{

		int count = 0;
		File f = new File("F:\\Java Programming\\DurgaSoft\\File IO");

		String[] s=f.list();
		for(String s1 : s) {
		File f1=new File(f,s1);
			if(f1.isFile()) {
			count++;
			System.out.println(s1);
		 	}
		 }
		System.out.println("total number : "+count);
	}
}
// output : 
// abc.txt
// Demo.class
// Demo.java
// FileIO1.java
// FileIO2.class
// FileIO2.java
// FileIO3.class
// FileIO3.java
// FileIO4.class
// FileIO4.java
// FileIO5.class
// Test.class
// total number : 12