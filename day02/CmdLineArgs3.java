//Program to read random number of integers from the user and find the sum of all those numbers
package day02;

public class CmdLineArgs3 {
    public static void main(String[] args) {
        int sum = 0;

		//The challenge is we don't know how many elements did the
		//user input as arguments. Since args is an array, we can
		//fetch the size of the array using args.length
		for(int i=0 ; i < args.length ; i++)		
		{
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(sum);
    }
}
