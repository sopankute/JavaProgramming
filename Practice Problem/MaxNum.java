import java.io.*;


public class MaxNum{
	public static void main(String[] args){

		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = (int)(1+Math.random()*100);
		}

		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");

		// int max =0;
        int max = Integer.MIN_VALUE;
        for(int e : arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("\nthe Maximum value in the array :"+max);

        
        int min = Integer.MAX_VALUE;
        for(int e : arr)
        {
        	if(e < min)
        		min = e;
        }
        System.out.println("The Minimum value in the array : "+min);
	}
}