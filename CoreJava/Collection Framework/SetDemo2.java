
import java.util.*;
public class SetDemo2{
    public static void main(String[] args) {
         TreeSet<String> hs=new TreeSet(new MyClass()); // 
         hs.add("C-DAC");
         hs.add("DAC");
         hs.add("DASSD");
         hs.add("March2022");
         hs.add("C-DAC"); // duplicates
         hs.add("Java");
         hs.add("Web Programming");
         hs.add("DS");
         System.out.println(hs);
         Iterator itr=hs.iterator();
         while(itr.hasNext())
             System.out.println(itr.next());
         TreeSet<Integer> ts=new TreeSet();
         ts.add(10);
         ts.add(1);
         ts.add(99);
         ts.add(49);
         System.out.println(ts);// NSO
    }
}
class MyClass implements Comparator{
    public int compare(Object o1, Object o2){
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1); // descending order
    }
}