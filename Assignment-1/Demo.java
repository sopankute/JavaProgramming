import java.util.*;
import java.io.*;

// Question 23

public class Demo{
	public static void main(String[] args){
		int num = (int)(0+Math.random()*100);
		System.out.println(num);

		Scanner sc = new Scanner(System.in);
		int i = 0, key;
		do{
			System.out.print("Enter a Number : ");
			key = sc.nextInt();
			if(key==num)
				System.out.println("you matched a number");
			else if(key>num)
				System.out.println("you entered number is High.");
			else
				System.out.println("you entered number is Low.");
			i++;
		}while(num!=key);

	}
}

// OUTPUT : 
				// Randomly generated number : 34
				// Enter a Number : 22
				// you entered number is Low.
				// Enter a Number : 66
				// you entered number is High.
				// Enter a Number : 55
				// you entered number is High.
				// Enter a Number : 44
				// you entered number is High.
				// Enter a Number : 33
				// you entered number is Low.
				// Enter a Number : 40
				// you entered number is High.
				// Enter a Number : 34
				// you matched a number
