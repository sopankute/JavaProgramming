//store all user entered text until EOF is detected
import java.io.*;
import java.util.Scanner;

public class FWDemo1 {
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("xyz.txt", true);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter text: ");
		String str = scanner.nextLine();

		while(!str.equals("EOF")) {
			fw.write(str);
			//add "\n" manually after each line
			fw.write("\n");
			str = scanner.nextLine();
		}

		fw.close();
		System.out.println("File written successfully!");
	}
}