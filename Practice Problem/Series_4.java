import java.util.Scanner;

public class Series_4{
	public static void main(String[] args)
	{

	// 1 : X/2 + X/4 + X/8 + X/16 + .... + N	

		int i, n, x;
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
	    n = sc.nextInt();
		System.out.print("Enter x value : ");
	    x = sc.nextInt();

		// for(i=0; i<n; i++)
		// {
		// 	sum += x/(2*Math.pow(2,i));
		// }
		System.out.println("Sum of Series : "+sum);

	// 2 : 2 - 6 + 18 - 54 + ... N	
	
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter n value : ");
	 	//    int n = sc.nextInt();

		//    int sum=0;
     	//    for(int i=0; i<n; i++)
	 	//    {
	 	//    	if(i%2 == 0)
	 	//    		sum += (int)(2*Math.pow(3,i));
		//    	else
	 	//    		sum -= (int)(2*Math.pow(3,i));
	 	//    }
	 	//    System.out.println("Sum of Series : "+sum);

	// 3 : (x+2)/10 + (x+4)/30 + (x+6)/90 + ... + N    

	 //    Scanner sc = new Scanner(System.in);
	 //    System.out.print("Enter n value : ");
	 //    int n = sc.nextInt();
	 //    System.out.print("Enter x value : ");
	 //    int x = sc.nextInt();
	 //    double sum = 0;

	 //    for(int i=0, a=2; i<=n; i++, a+=2)
	 //    {
	 //    	sum += (x + a)/(10*Math.pow(3,i));
	 //    }
	 //    System.out.println("Sum of series : "+sum);

    // 4 : (x+5^2)/(1+2) + (x+25^2)/(2+3) + (x+125^2)/(3+4) + ... + N
        
		// Scanner sc = new Scanner(System.in);
	 //    System.out.print("Enter n value : ");
	 //    int n = sc.nextInt();
	 //    System.out.print("Enter x value : ");
	 //    int x = sc.nextInt();
	 //    double sum = 0;

	 //    for(int i=1, a=5; i<=n; i++, a*=5)
	 //    {
	 //    	sum += (x + Math.pow(a,2))/(2*i+1);
	 //    }
	 //    System.out.println("Sum of series : "+sum);

	}
}   