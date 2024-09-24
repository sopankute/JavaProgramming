import java.io.*;

public class RWDemo{
	public static void main(String[] args) throws Exception {

		// FileReader fr = new FileReader("RWDemo.java");
		BufferedReader br = new BufferedReader(new FileReader("RWDemo.java"));

		// FileWriter fw = new FileWriter("test2.txt", true);
		BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt"));

		int i;
		while((i = br.read()) != -1) {
			bw.write(i);
			System.out.print((char)i);
		}
		bw.write("\n\n-----------------------------");
		bw.close();
		br.close();
	}
}