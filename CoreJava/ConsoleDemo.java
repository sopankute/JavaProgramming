
import java.io.*;
public class ConsoleDemo{
    
    public static void main(String[] args){
        Console c=System.console(); // console() is static 
        
        System.out.println("Enter Name ");
        String name=c.readLine();
        System.out.println("Enter weight");
        Double weight=Double.parseDouble(c.readLine());
        System.out.println(name+" "+weight);
        System.out.println("Enter Password: ");
        char[] pwd=c.readPassword();
        System.out.println(pwd);
    }
}