
import java.io.*;
public class ReadWriteDemo{
   public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("ReadWriteDemo.java");
        FileWriter fw = new FileWriter("RW.txt");

        int i = 0;
        while((i = fr.read())!= -1){
            fw.write(i);
            System.out.print((char)i);
        }
        String str = "\n------------------------";
        fw.write(str);
        fr.close();
        fw.close();
   }
}