import java.io.*;

public class FileIO6{
	public static void main(String[] args) throws IOException{

		int count = 0;
		File f = new File("D:\\C-DAC Hydrabad");

		String[] s=f.list();
		for(String s1 : s) {
		File f1=new File(f,s1);
			if(f1.isDirectory()) {
			count++;
			System.out.println(s1);
		 	}
		 }
		System.out.println("total number : "+count);
	}
}

// output :
// 1. Basic Programming C
// 2. Core Java
// 3. Data Structure and Algorithams
// 4.Operating System
// 6.DBMS
// 7. Adv. Java
// Linux_Training
// Software Dev
// SQL
// total number : 9