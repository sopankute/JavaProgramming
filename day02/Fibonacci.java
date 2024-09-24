package day02;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 10, fib = 0, nextFib = 1, temp = 1;

		while(num != 0)
		{
			System.out.print(fib + " ");
			fib = nextFib;
			nextFib = temp;
			temp = fib + nextFib;
			num--;
		}
	}
}