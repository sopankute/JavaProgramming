
import java.util.*;
public class SetDemo1{
    public static void main(String[] args) {
         TreeSet<String> hs=new TreeSet(); // 
         hs.add("C-DAC");
         hs.add("DAC");
         hs.add("DASSD");
         hs.add("March2022");
         hs.add("C-DAC"); // duplicates
         hs.add("Java");
         hs.add("Web Programming");
         hs.add("DS");
         System.out.println(hs);
         System.out.println(hs.first()); //C-DAC
         System.out.println(hs.last());//Web
         System.out.println(hs.headSet("Java"));
         System.out.println(hs.tailSet("DAC"));
         Iterator itr=hs.iterator();
         while(itr.hasNext())
             System.out.println(itr.next());
    }
}