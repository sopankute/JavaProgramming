/* Print A-Z and a-z using only one loop 
(a popular interview question) */
public class ContinueDemo {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 65 ; i <= 122 ; i++) {
            if(i > 90 && i < 97)
                continue;   //skip ASCII 91-96

            System.out.print((char)i + " ");

            count ++; //count number of characters printed
            if(count % 13 ==0) //print \n after every 13 characters
                System.out.println();
        }
        System.out.println();
    }
}
