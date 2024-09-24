
import java.lang.reflect.*;
public class ReflectDemo2{
    
    public static void main(String[] args) {
        
        Object o=new String("Java"); // String class will get loaded
        Class c=o.getClass(); // immuatable instance of class - entry point 
        System.out.println(c.getName()); //FQN
        Method[] m=c.getDeclaredMethods(); //  all methods
       
        Field[] f=c.getDeclaredFields(); // fields
        
        for(Method i:m){
            System.out.println("Method Name: " +i.getName());
            Class<?> parameterTypes[]=i.getParameterTypes();
            for(int k=0;k<parameterTypes.length;k++)
                System.out.println("Parameter "+(k+1)+" .....Parameter Type: "+parameterTypes[k].getName());
        }
        System.out.println("The no. of methods in "+c.getName()+" are "+ m.length);//
        for(Field j:f){
            System.out.println("Field Name: "+ j.getName());
            System.out.println(Modifier.toString(j.getModifiers()));
        }
   