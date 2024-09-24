import java.util.Scanner;

public class KmToMile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Distance in Km : ");


	    int km = sc.nextInt();

		float mile = (float)(0.621371 * km);
		System.out.println(km+" km  : "+mile+" miles");

	}
}