import java.util.*;

public class FactProgram{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// int n = (int)(1 + (Math.random() * 100));	// 1 to 100
		// System.out.print("Taking random number bet 1 to 100  : "+n+" : ");

		System.out.print("Enter the Number : ");
		int n = sc.nextInt();

	// Program : Find Factors of a Number 
		
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
				System.out.print(i+" ");
		}

	// Program : Check a Number isPrime or Not

		// int count=0;	
		// for(int i=1; i<=n; i++)
		// {
		// 	if(n%i == 0)
		// 		count++;
		// }
		// if(count==2)
		// 	System.out.print("Prime - Divisible by 1 and itself");
		// else
		// 	System.out.print("NotPrime");


	// Program : Check Whether a number isComposite Or Not	

		// 	int count=0;			// used to count no. of factors
		// 	for(int i=1; i<=n; i++)
		// {
		// 	if(n%i == 0)
		// 		count++;
		// }
		// if(count>3)
		// 	System.out.print("Composite - Has a more than one Factor(except 1 and itself)");
		// else
		// 	System.out.print("NotComposite");

	// Program : Check isPerfect or Not

		// int sum=0;
		// for(int i=1; i<n; i++)
		// {
		// 	if(n%i == 0)
		// 		sum += i;
		// }
		// if(sum == n)
		// 	System.out.print("Perfect - Equal to sum of factors(except itself)");
		// else
		// 	System.out.print("NotPerfect");

		// Program : Check the no. is Abundant no. Or Not

		// int sum=0;
		// for(int i=1; i<n; i++)
		// {
		// 	if(n%i == 0)
		// 	{
		// 		System.out.print(i+" ");
		// 		sum += i;
		// 	}
		// }
		// if(sum > n)
		// 	System.out.print("Abundant - sum of factors(except itself) Is Greater Than that number");
		// else
		// 	System.out.print("NotAbundant");

		// Program : Check no. is Deficient Or Not

		// int sum=0;
		// for(int i=1; i<n; i++)
		// {
		// 	if(n%i == 0)
		// 	{
		// 		System.out.print(i+" ");
		// 		sum += i;
		// 	}
		// }
		// if(sum < n)
		// 	System.out.print("Deficient - sum of factors(except itself) Is Less Than that number");
		// else
		// 	System.out.print("Notdeficient");

	
		// Program : Check no. isPronic or Not 

		// int fact=0, i;
		// for(i=1; i<n; i++)
		// 	{
		// 		if(n%i == 0)
		// 			if(i*(i + 1) == n )
		// 			{
		// 				System.out.print(i+" "+(i+1));
		// 				fact = i;
		// 			}
		// 	} 
		// if(fact != 0)
		// 	System.out.print(" - Pronic number - Product of two consecutive integers");
		// else
		// 	System.out.print("  NotPronic");

	}
}