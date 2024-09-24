import java.io.*;
import java.util.Scanner;

public class FileWriterDemo1{
    public static void main(String[] args) throws IOException{

        FileWriter fw = new FileWriter("xyz.txt", true);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text you want to write to the file : ");
        char ch;
        String str = sc.nextLine(); // used to take string type input from user
        int i=0;
        while((ch=str.charAt(i))!= 'z'){    // used read char by char from string 
            fw.write(ch);
            i++;
        }
        fw.close();
        System.out.println("file written successfully...");
    }
}