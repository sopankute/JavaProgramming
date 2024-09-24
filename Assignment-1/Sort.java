import java.util.Scanner;

// Question 9

public class Sort{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);

		int i, j, n, temp=0;
		System.out.print("Enter the number of elements to be enter : ");
	    n = sc.nextInt();
		int [] array = new int[n];

		System.out.print("Enter the elements : ");
		for(i=0; i<n; i++)
			array[i] = sc.nextInt();

		System.out.println("0 : Exit \n1 : Ascending Order \n2 : Decending Order");
		int choice = sc.nextInt();

		switch(choice){
		case 0 :
			break;
		case 1 :
				System.out.print("Ascending Order : ");  
			    for(i=0; i<array.length; i++){
			   		for(j=i+1; j<array.length; j++){
			     	  if(array[i]>array[j]){
				  	       temp = array[i];
				    	   array[i] = array[j];
				      	   array[j] = temp;
				 	    }
		  		    }
				}	
			break;
		case 2 :
				System.out.print("Decending Order : ");
				for(i=0; i<array.length; i++){
					for(j=i+1; j<array.length; j++){
						if(array[i]<array[j]){
			      			temp = array[i];
			   			    array[i] = array[j];
			   	 		    array[j] = temp;
						}
					}			
				}

			break;		
		}
		for(i=0; i<array.length; i++)
		System.out.print(array[i]+" ");

	}
}
/*
OUTPUT :
Enter the number of elements to be enter : 8
Enter the elements : 7 3 2 8 6 9 5 4
0 : Exit 
1 : Ascending Order
2 : Decending Order
1
Ascending Order : 2 3 4 5 6 7 8 9 

Enter the number of elements to be enter : 8
Enter the elements : 8 2 1 4 5 3 8 7
0 : Exit 
1 : Ascending Order
2 : Decending Order
2
Decending Order : 8 8 7 5 4 3 2 1 
*/