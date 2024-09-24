import java.io.*;
import java.util.*;

// Question 10

public class UserInput{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Please enter \n0. Exit \n1. Addition");
			int choice = sc.nextInt();
			if(choice == 0){
				break;
			}
			else{
				System.out.print("Enter first number : ");
				int n1 = sc.nextInt();
				System.out.print("Enter second number : ");
				int n2 = sc.nextInt();
				int sum = n1 + n2;
				System.out.println(sum);
			}
		}while(true);
	}
}
/*
OUTPUT :
					Please enter
					0. Exit
					1. Addition
					1
					Enter first number : 7
					Enter second number : 8
					15
					Please enter
					0. Exit
					1. Addition
					1
					Enter first number : 9
					Enter second number : 4
					13
					Please enter
					0. Exit
					1. Addition
					0
*/