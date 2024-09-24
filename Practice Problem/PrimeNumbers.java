import java.io.*;
import java.util.*;

public class PrimeNumbers{
	// public static boolean isPrime(int n){
	// 	for(int i=2; i<=n/2; i++){
	// 		if(n%i == 0)
	// 			return false;
	// 	}
	// 	return true;
	// }
	// public static void main(String args[]){
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.print("Enter Number : ");
	// 	int num = sc.nextInt();
	// 	if(isPrime(num))
	// 		System.out.println("Prime");
	// 	else
	// 		System.out.println("Not Prime");
	// }

	// public static void main(String args[]){
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.println("Enter a Number : ");
	// 	int n = sc.nextInt();
	// 	int i;
	// 	if(n==1)
	// 		System.out.printf(" %d is not a prime number.",n);
	// 	else{
	// 		for(i=2; i<n; i++){
	// 			if(n%i==0){
	// 				System.out.println("not Prime ");
	// 				break;
	// 			}
	// 		}
	// 		if(n==i)
	// 			System.out.println("Prime...");
	// 	}
	// }

	// public static void main(String[] args) {
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.println("Enter  Number : ");
	// 	String number = sc.next();
	// 	int num = Integer.parseInt(number);
	// 	int counter;
	// 	for(int i=2; i<=num; i++){
	// 		counter = 0;
	// 		for(int j=1; j<=i; j++){
	// 			if(i%j == 0)
	// 				counter++;
	// 		}
	// 		if(counter == 2)
	// 			System.out.print(i+"  ");
	// 	}
	// }

	// public static void main(String[] args) {
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.print("Enter Number : ");
	// 	int num = sc.nextInt();

	// 	for(int i=1; i<num; i++){
	// 		boolean isPrime = true;
	// 		for(int j=2; j<i; j++){
	// 			if(i%j == 0){
	// 				isPrime = false;
	// 				break;
	// 			}
	// 		}
	// 		if(isPrime){
	// 			System.out.print(i+" ");
	// 		}
	// 	}
	// }

	// public static void main(String[] args) {
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.print("Enter a number : ");
	// 	int num = sc.nextInt();
	// 	int i,j,sum = 0;
	// 	for(i=1; i<num; i++){
	// 		boolean isPrime = true;
	// 		for(j=2; j<i; j++){
	// 			if(i%j==0){
	// 				isPrime = false;
	// 				break;
	// 			}
	// 		}
	// 		if(isPrime){
	// 			sum += i;
	// 			System.out.print(i+"  ");
	// 		}
	// 	}
	// 	System.out.println("\n"+sum);
	// }


	// public static void main(String[] args) {
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.print("Enter a number : ");
	// 	int num = sc.nextInt();
	// 	int i,j;
	// 	for(i=1; i<=num; i++){
	// 		for(j=1; j<=10; j++){
	// 			System.out.println(j+"*"+i+"="+i*j+"\t");
	// 		}
	// 		System.out.println();
	// 	}
	// }


	// public static void main(String[] args) {
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.println("enter a number : ");
	// 	int n = sc.nextInt();
	// 	int sum = 0;
	// 	for(int i=1; i<=n/2; i++){
	// 		if(n%i==0)
	// 			sum = sum + i;
	// 	}
	// 	if(n==sum)
	// 		System.out.println(n+" Perfect number...");
	// 	else
	// 		System.out.println(n+" is Not Perfect number...");
	// }


	// public static void main(String[] args) {
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.println("Enter a number : ");
	// 	int n = sc.nextInt();
	// 	for(int i=1; i<=n; i++){
	// 		int sum = 1;
	// 		for(int j=2; j<=i/2; j++){
	// 			if(i%j == 0)
	// 				sum += j;
	// 		}
	// 		if(sum == i)
	// 			System.out.println("  "+i);
	// 	}
	// }


	// public static void main(String[] args) {
	// 	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 	System.out.println("Enter a Number : ");
	// 	int n = sc.nextInt();
	// 	int temp = n;
	// 	int rev = 0;
	// 	while(n != 0){
	// 		int rem = n % 10;
	// 		rev = rev*10 + rem;
	// 		n = n / 10;
	// 	}
	// 	if(temp == rev)
	// 		System.out.println("Palindrome...");
	// 	else 
	// 		System.out.println("Not Palindrome");
	// }


	// static int fact(int num){
	// 	int fact = 1;
	// 	if(num == 1){
	// 		return num;
	// 	}
	// 	for(int i=1; i<=num; i++){
	// 		fact *= i; 
	// 	}
	// 	return fact;
	// }
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	int n = sc.nextInt();
	// 	int temp = n;
	// 	int sum = 0;
	// 	while(n != 0){
	// 		int digit = n % 10;
	// 		sum += fact(digit);
	// 		n = n / 10;
	// 	}
	// 	if(temp == sum)
	// 		System.out.println("Strong");
	// 	else
	// 		System.out.println("not Strong");
	// }



	// static int fib(int n){
	// 	if(n==0)
	// 		return 0;
	// 	if(n==1)
	// 		return 1;
	// 	return fib(n-1)+fib(n-2);
	// }
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	int n = sc.nextInt();
	// 	int num = fib(n);
	// 	System.out.println(num);
	// }


	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.print("Enter a number : ");
	// 	int range = sc.nextInt();
	// 	int a=0, b=1, c=0;
	// 	System.out.print(a+" ");
	// 	System.out.print(b+" ");
	// 	for(int i=2; i<=range; i++){
	// 		c = a+b;
	// 		if(c<=range){
	// 			System.out.print(c+" ");
	// 			a=b;
	// 			b=c;
	// 		}
	// 	} 
	// }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = 0;
		for(int i=1; i<num1; i++){
			if(num1%i==0 && num2%i==0){
				gcd = i;
				// System.out.print(i+"  ");
			}
		}
		System.out.println(gcd);
	}	

}