
import java.util.*;
public class StackDemo{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("Java");
        s.push("C");
        s.push("Python");
        s.add(10);
        s.add(90);
        s.add("Java");
        s.push(false);
        System.out.println(s);
        System.out.println(s.peek()); // TOS
        System.out.println(s.pop()); // false
        System.out.println(s.pop()); //Java
        System.out.println(s.pop()); //90
        System.out.println(s.peek());//10
        s.push(100);
        s.add(10);
        s.add(90);
        s.add("Java");
        s.push(false);
        System.out.println(s);
       
        Iterator itr=s.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
         Enumeration e=s.elements();
         while(e.hasMoreElements()){
             System.out.println(e.nextElement());
         }
    }
}