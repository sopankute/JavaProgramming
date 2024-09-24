import java.io.*;

public class RWCount{
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("test2.txt", true);
		FileReader fr = new FileReader("testd.txt");

		int i, lineCount = 0, wordCount = 0, charCount = 0;
		while((i = fr.read()) != -1) {
			fw.write(i);
			System.out.print((char)i);
			
			charCount++;
			if((char)i == '\n') {
				lineCount++;
				charCount--;
			}
			if((char)i == ' ' || (char)i == '\n') {
				wordCount++;
				charCount--;
			}
		}
		lineCount++; //last line
		wordCount++; //last line

		System.out.println("\nLine: "+lineCount+"\nWord: "+wordCount+"\nChar: "+charCount);
		fw.close();
		fr.close();
	}
}