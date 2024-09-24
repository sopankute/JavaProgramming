public class BitwiseOps {
    public static void main(String[] args) {
        //bitwise operators
        int a=3;
        int b=4;
        //int c=-4;

        System.out.println(a+ " & " +b+ " = "+(a & b));
        System.out.println(a+ " | " +b+ " = "+(a | b));
        System.out.println(a+ " ^ " +b+ " = "+(a ^ b));
        System.out.println("~" +a+ " = "+(~a));
        System.out.println("~" +b+ " = "+(~b));
        System.out.println(b+ " >> 2 = "+(b>>2));
        System.out.println(b+ " << 2 = "+(b<<2));
        //System.out.println(c+ ">>>2 : "+(c>>>2));

    }
}
