package day02;

public class MathExample {
	public static void main(String[] args) {

		// 0.0 to 1.0 (0.0 >= n > 1)
		//int n = Math.random();

		// 0 to 10
		//int n = (int)(Math.random()*10);

		//50 to 60
		//int n = 50 + (int)(Math.random()*10);

		//0 to 100
		int n = (int)(Math.random()*100);
		System.out.println("Generated no: " + n);

		//check if generated number is even or odd
		if(n % 2 == 0)
			System.out.println(n + " is Even");
		else
			System.out.println(n + " is Odd");
	}
}