/* Print odd numbers from 0 to 30 */
public class WhileDemo {
    public static void main(String[] args) {
        
        int i = 1; //initialization

        while(i <= 30) { //test condition

            System.out.println(i); // 1, 3, 5 ...
            
            i = i + 2; //update statement
        }
    }
}
