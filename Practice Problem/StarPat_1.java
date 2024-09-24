import java.util.*;

public class StarPat_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++){
				System.out.print("* ");
			}
		    System.out.println();
		}
	}
}
//				 		     i - row
//				 * * * * *    1
//				 * * * * *    2
//				 * * * * *    3
//				 * * * * *    4
//				 * * * * *    5

//				 1 2 3 4 5  j
//				 colomn