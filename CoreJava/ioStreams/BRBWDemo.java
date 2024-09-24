
import java.io.*;
public class BRBWDemo{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("BRBWDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("BRBW.txt"));

        int i=0;
        while((i=br.read())!= -1){
            bw.write(i);
            System.out.print((char)i);
        }
        String str = "\n-------------------";
        bw.write(str);
        System.out.println("\nFile written successfully.....");
        br.close();
        bw.close();
    }
}