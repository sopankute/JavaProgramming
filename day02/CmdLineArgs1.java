//read and print your name without using any classes etc.
//pass 3 arguments Name, Place and Age in command line
package day02;

public class CmdLineArgs1 {

	public static void main(String[] args) { //JVM calls First.main()

		System.out.println("My name is "+ args[0]);
		System.out.println("I'm from "+ args[1]);
		System.out.println("My age is "+ args[2]);
    }
}
