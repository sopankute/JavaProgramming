//read and write using readLine() method
import java.io.*;

public class RWDemoBR{
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("RWDemoBR.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt"));

		String line = br.readLine(); //reads a line of text from RWDemoBR.java
		while(line != null) {//readLine() checks EOF with null
			bw.write(line+"\n"); //writing to .txt
			System.out.println(line); //keeping 'ln' because printing a whole line
			line = br.readLine();
		}

		System.out.println("\nFile written successfully!");
		bw.close();
		br.close();
	}
}