/* Print odd numbers from 0 to 50 */
public class DoWhileDemo {
    public static void main(String[] args) {
        
        int i = 1; //initialization

        do{
            if(i % 2 != 0) //if i is not even
                System.out.println(i); // 1, 3, 5 ...
            
            i++; //update statement
        }while(i <= 50); //semicolon is mandatory!
    }
}
