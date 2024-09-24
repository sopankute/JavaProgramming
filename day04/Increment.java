public class Increment {
    public static void main(String[] args) {

        int a = 10;
        int x = a++ + ++a;
        System.out.println("x = " + x + "\n" + "a = " + a);
    }
}
