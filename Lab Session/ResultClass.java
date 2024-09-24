import java.io.*;
import java.util.*;

public class ResultClass{
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("IOFileTest.java");
		Scanner sc = new Scanner(fr);

		int count1=0;
     	while(sc.hasNextLine()){
        	sc.nextLine();
        	count1++;
    	}
     	System.out.println("The no of Lines : "+count1);
     	sc.close();
	}
}