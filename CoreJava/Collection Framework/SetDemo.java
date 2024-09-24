
import java.util.*;
public class SetDemo{
    public static void main(String[] args) {
         
         Set hs=new HashSet(); // 
         hs.add("C-DAC");
         hs.add(1988);
         hs.add("DAC");
         hs.add("DASSD");
         hs.add("March2022");
         hs.add(0.5);
         hs.add("C-DAC"); // duplicates
         hs.add(true);
         hs.add(92.7);
         System.out.println(hs);
         Iterator itr=hs.iterator();
         while(itr.hasNext())
             System.out.println(itr.next());
    }
}