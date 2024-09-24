import java.io.*;

public class FileReaderDemo{
    public static void main(String[] args) throws IOException{

        // FileReader fr = new FileReader("xyz.txt");
        FileReader fr = new FileReader("FileReaderDemo.java");  // used to read file

        int i=0;
        while((i=fr.read())!=-1){       // read xyz/java file 
            System.out.print((char)i);
        }

        fr.close();
    }
}