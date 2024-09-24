//Addition of two numbers using command line arguments
//pass 2 numbers as arguments in command line
package day02;

public class CmdLineArgs2 {
    public static void main(String[] args) {

        /*if we try: 
            System.out.println("sum: "+ (args[0]+args[1])); 
        
            this will return concatenated string, not the sum of two
            numbers because the array args[] is of type String */

        //Hence we first need to convert string -> integer
            int a = Integer.parseInt(args[0]); //"20" to 20
            int b = Integer.parseInt(args[1]); //"30" to 30

            int sum = a+b; //20+30

            System.out.println("Sum is "+sum); //50
    }
}
