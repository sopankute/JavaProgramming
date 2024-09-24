import java.util.Scanner;

public class Percentage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double total = 400.0, sum = 0.0, per;
		System.out.print("Enter no. of subjects : ");
		int n = sc.nextInt();

		double[] sub = new double[10];	// Array

		System.out.println("Enter your subjects marks : ");
		for(int i=1; i<=n; i++)
		{
			System.out.print("Sub["+i+"] : ");
			sub[i] = sc.nextDouble();
			sum = sum + sub[i];
		}
		System.out.println("Sum of all sbjects marks : "+sum);

		per = (sum*100)/total;
		System.out.println("Percentage of Marks : "+per);

		float cgpa = (float)(sum / 40);
		System.out.println("total CGPA : "+cgpa);

		// cgpa = per / 9.5;
	}
}