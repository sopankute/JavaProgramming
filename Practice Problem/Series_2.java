import java.util.Scanner;

public class Series_2{
	public static void main(String[] args){

	// Arithmetic Series 

	// 1 : X^1 + X^2 + X^3 + X^4 + .... + N

		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.print("Enter Base Number : ");
		int x = sc.nextInt();

		for(int i=1, a=1; i<=n; i++, a++)
		{
			sum = sum + Math.pow(x,a);
		}
		System.out.println(sum);


	// 2 : 9^2 + 13^2 + 17^3 + .... + N

		 // Scanner sc = new Scanner(System.in);
		 // double sum = 0;
		 // System.out.print("Enter a Number : ");
		 // int n = sc.nextInt();

		 // for(int i=1, a=9; i<=n; i++, a+=4)
		 // {
		 // 	sum += Math.pow(a,2);
		 // }
		 // System.out.println("Sum of the series : "+sum);


	// 3 : 2^x + 4^x + 6^x + .... + 20
	
	    // Scanner sc = new Scanner(System.in);
		// double sum = 0;
		// System.out.print("Enter a Number : ");
		// int n = sc.nextInt();                     // 10
		// System.out.print("Enter power Number : ");
		// int x = sc.nextInt(); 

		// for(int i=1, a=1; i<=n; i++, a+=2)
		// {
		// 	sum += Math.pow(a,x);
		// }
		//  System.out.println("Sum of the series : "+sum);


	// 4 : 1^3/x + 3^3/x + 5^3/x + 7^3/x + .... + N

		// Scanner sc = new Scanner(System.in);
		// double sum = 0;
		// System.out.print("Enter a Number : ");
		// int n = sc.nextInt();                     
		// System.out.print("Enter Denomin Number : ");
		// int x = sc.nextInt(); 

		// for(int i=1, a=1; i<=n; i++, a+=2)
		// {
		// 	sum = sum + Math.pow(a,3)/x;
		// }
		// System.out.print("Sum of Series : "+sum);


	// 5 : 2/10 + 4/9 + 6/8 + .... 20/1
	
		// Scanner sc = new Scanner(System.in);

		// double sum=0;
		// System.out.print("Enter the Number : ");
		// int x = sc.nextInt();

		// for(int i=1, N=2, D=10; i<=x; i++, N+=2, D--)
		// {
		// 	sum += (double)N/D;
		// }
		// System.out.println("Sum of the Series : "+sum);

	}
}