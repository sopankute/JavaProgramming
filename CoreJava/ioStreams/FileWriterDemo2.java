import java.io.*;
import java.util.Scanner;


public class FileWriterDemo2{
public static void main(String[] args) throws IOException{
    FileWriter fw = new FileWriter("xyz.txt", true);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no line of text : ");
    String str = sc.nextLine();

    while(!str.equals("END")){
        fw.write(str);
        System.out.println();
        str = sc.nextLine();
    }
    fw.close();
    System.out.println("file written successfully...");
    }
}
    