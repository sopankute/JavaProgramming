
import java.lang.reflect.*;
public class ReflectDemo1{
    
    public static void main(String[] args) {
        
        Object o=new String("C-DAC"); // String class will get loaded
        Class c=o.getClass(); // immuatable instance of String - entry point 
        System.out.println(c.getName()); //FQN
        Method[] m=c.getDeclaredMethods(); //  all methods
       
        Field[] f=c.getDeclaredFields(); // fields
        
        for(Method i:m)
            System.out.println(i.getName());
        System.out.println("The no. of methods in "+c.getName()+" are "+ m.length);//
        for(Field j:f)
            System.out.println(j.getName());
        System.out.println("The no. of fieldss in "+c.getName()+" are "+ f.length);//
    }
}