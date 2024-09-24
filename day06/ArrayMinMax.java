public class ArrayMinMax {
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        System.out.println("Array elements are:");
        for(int x : arr)
            System.out.print(x+" ");
        System.out.println();

        //initialize min and max = arr[0]
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
                
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Minimum = "+min+"\nMaximum = "+max);
    }
}
