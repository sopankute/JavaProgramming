import java.util.Scanner;

public class Series_3{
	public static void main(String[] args){

	// Geometric Series


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();

	// 1 : 2 + 4 + 8 + 16 + ... N

		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum = sum + (int)Math.pow(2,i);
		}

		// for(int i=1, a=2; i<=n; i++, a*=2)
		// {
		// 	sum = sum + a;
		// }
		System.out.println("sum Of the series : "+sum);

	// 2 : 2 + 6 + 18 + 54 + ... N	

		// int i, sum=0;
		// for(i=0; i<n; i++)
		// {
		// 	sum = sum + (int)(2 * Math.pow(3,i));
		// }
		// System.out.println("Sum of Series : "+sum);


	// 3 : 10 + 30 + 90 + 270 + ... N

	// int i, sum=0;
	// 	for(i=0; i<n; i++)   
	// 	{
	// 		sum = sum + (int)(10 * Math.pow(3,i));
	// 	}
	// 	System.out.println("Sum of Series : "+sum);		


	// 4 : 5 + 25 + 125 + ... N

		// int i, sum=0;
		// for(i=1; i<=n; i++)   
		// {
		// 	sum = sum + (int)(Math.pow(5,i));
		// }
		// System.out.println("Sum of Series : "+sum);		


	}

}