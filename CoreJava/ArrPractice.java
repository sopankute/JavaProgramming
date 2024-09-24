public class ArrPractice{
	public static void main(String[] args){

		// int[] arr;
		// arr = new int[10];   // valid

		// int[] arr = new int[10];  // valid

		// int[] marks = {10, 20, 30, 40, 50};   // valid

		// int[] marks = new int[10];    // valid

		// boolean[] arr = new boolean[10];

		int[] marks = new int[]{10, 20, 30, 40, 50};   // also valid

		// marks[0] = 20;
		// marks[1] = 30;
		// marks[3] = 40;
		// marks[7] = 50;
		// // marks[n] = 80;

		for(int e : marks)
			System.out.print(e+"  ");

		//  Array of Object
		 // Student[] arr = new Student[7];    //student is a user-defined class
		sum(marks);

	}
	public static void sum(int[] arr)
	{
		int sum=0;
		for(int element : arr)
			sum += element;
		System.out.println("\nSum of Array marks : "+sum);
	}
}