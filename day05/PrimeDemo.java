public class PrimeDemo {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int i = 1, count = 0;

        while(i <= n/2) { //for any number, ideally, there exits no factor greater than it's half size

        //more efficient logic is to use square root of n
        //while(i <= Math.sqrt((double)n)) {
        
            if(n % i == 0) {
                count++; //factors count
                
                if(count > 1)
                    break;
            }
            i++; //update condition
        }
        
        if(count == 1)
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");

        System.out.println("The loop is executed for "+i+" times");
        
    }
}
