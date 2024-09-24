import java.io.*;
import java.util.*;

public class StreamClass{
	public static void main(String[] args) throws Exception{
		File fr=new File("rw.txt");
		Scanner sc = new Scanner(fr);

		int count=0;
     	while(sc.hasNextLine()){
        	sc.nextLine();
        	count++;
    	}
     	System.out.println(count);
     	sc.close();

	}
}