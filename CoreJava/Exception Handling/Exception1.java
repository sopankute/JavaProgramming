
import java.io.*;
public class Exception1{
    
    public static void main(String[] args) {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Pls enter two nos");
     int x=0,y=0;
     try{
     x=Integer.parseInt(br.readLine());
     y=Integer.parseInt(br.readLine());
   
     int res1=x/y; // throw new ArithmeticException(); - implicitly
     System.out.println("Result: "+res1);
     String s=null;
     System.out.println(s.length()); //NPE
     } // try end
     catch(NumberFormatException | ArithmeticException | NullPointerException | IOException e){ // multi catch - |
     System.err.println(e); // 
     }
     catch(Exception e){
          System.err.println(e); //
     }
        
     int res2=x+y;
     System.out.println("Result: "+res2);
     System.out.println("rest of code......follows");
    }
}