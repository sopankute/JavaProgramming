public class LogicalOps {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 100); //0 - 99
        System.out.println("Generated "+num);

        if(num % 2 == 0 && num % 3 == 0)
            System.out.println(num+" divisible by 2 and 3");
        if(num % 2 == 0 || num % 3 == 0)
            System.out.println(num+" divisible by 2 or 3");

    }
}
