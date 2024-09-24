import java.io.*;
public class PrintNumberes{

	/*static int a;
	// static int x = 30;	// x=30

	final int b;				// error				
	// final int y = 40;		// y=40

	public void disp(){
		// System.out.println(a);
		// System.out.println(x);

		// System.out.println(b);
		// System.out.println(y);*/
	// }

	public static void main(String[] args) {

		try{
			int x = 10/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
			/*a = 10;
			System.out.println(a);
			// System.out.println(x);

			// System.out.println(b);
			// System.out.println(y);

			PrintNumberes obj = new PrintNumberes();
			obj.disp();

			// java.util.Scanner sc = new java.util.Scanner(System.in);
			// System.out.println("Enter number : ");
			// int num = sc.nextInt();
			// int sum = 0;
			// // for(int i=1; i<=num; i++)
			// // 	System.out.print(i+"  ");
			// // System.out.println();

			// for(int i=num; i>=1; i--){
			// 	sum += i;
			// }
			// System.out.println(sum);

			// if(num % 2 == 0)
			// 	System.out.println("Even");
			// else
			// 	System.out.println("Odd");*/
		}	
}