
import java.lang.reflect.*;
public class Person{
    
    private static String uname="cdac";
    private String pwd="secret password";
    void setPerson(){}
    void disp(){}
public static void main(String[] args) throws Exception{
    Person p=new Person();
    Class c=p.getClass(); // immutabler instance of Class
    Field[] f=c.getDeclaredFields();
    for(Field field:f)
        System.out.println(field.getName()+"   "+Modifier.toString(field.getModifiers()));
    Field password=c.getDeclaredField("pwd");
    password.setAccessible(true);
    String secretinfo=(String)password.get(p);
    System.out.println("Private data is "+ secretinfo);
}
}