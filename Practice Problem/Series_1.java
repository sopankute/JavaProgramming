import java.util.Scanner;

public class Series_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int sum=0;

	// 1
		for(int i=1, a=1; i<=n; i++, a++)
			sum = sum + a;

	// 2
		// for(int i=1, a=9; i<=n; i++, a+=5)
		// 	sum = sum + a;	

	// 3
		// for(int i=1, a=2; i<=n; i++, a+=3)
		// 	sum = sum + a;

	// 4
		// for(int i=1, a=1; i<=n; i++, a+=2)
		// 	sum = sum + a;				

	// 5
		// for(int i=1, a=10; i<=n; i++, a--)
		// 	sum = sum + a;			

		System.out.println("Sum of Series : "+sum);
	}
}