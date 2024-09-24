import java.io.*;

public class FileWriterDemo{
    public static void main(String[] args) throws IOException{

        // File f = new File("xyz.txt");       // used to create file 
        // FileWriter fw = new FileWriter(f);  // used to write to file

        // FileWriter fw = new FileWriter("xyz.txt");    // also used to create file

        FileWriter fw = new FileWriter("xyz.txt", true);    // it will append this string to xyz.txt
        
        String str = "Java is a Object Oriented Programming langauge.\n";
        fw.write(str);

        fw.close();
        System.out.println("File is successfully created.");
    }
}