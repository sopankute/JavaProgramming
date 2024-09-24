public class MethodsDemo {
    public static void main(String[] args) {
    /* Too repetitive :(         
        int sum1 = 0;
        for(int i = 1; i <= 10; i++)
            sum1 += i;
        System.out.println(sum1);

        int sum2 = 0;
        for(int i = 100; i <= 150; i++)
            sum2 += i;
        System.out.println(sum2);

        int sum3 = 0;
        for(int i = 1000; i <= 1500; i++)
            sum3 += i;
        System.out.println(sum3);
    */
    //Instead, use methods :)
        System.out.println(sum(1,10)); //method calls - actual arguments
        System.out.println(sum(100,150)); //equivalent to MethodsDemo.sum(100,150);

        int res1 = sum(1000,1500);
        System.out.println(res1);

        int res2 = sum(12345,54321);
        System.out.println(res2);

    }

    //method definition - formal arguments
    public static int sum(int x, int y) {
        int sum = 0;
        for(int i = x; i <= y; i++)
            sum += i;
        
            return sum;
    }
}
