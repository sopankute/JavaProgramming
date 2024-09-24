import java.io.*;

public class FileIO4{
	public static void main(String[] args) throws IOException{

		int count = 0;
		File f = new File("F:\\Java Programming\\DurgaSoft");

		String[] s = f.list();

		for(String s1 : s){
			count++;
			System.out.println(s1);
		}
		System.out.println("no of directories : "+count);
	}
}
// output : 
// Collection Framework
// File IO
// Inner Classes
// JVM
// MultiThreading
// no of directories : 5