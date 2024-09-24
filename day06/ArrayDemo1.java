import java.rmi.StubNotFoundException;

public class ArrayDemo1 {
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        // for(int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i] + " ");
        // System.out.println();

        //using for-each nad calculating sum
        int sum = 0;
        for(int x : arr) {
            System.out.print(x+" ");
            sum += x; // sum = sum + x
        }
        System.out.println();

        // sum of all array elements
        System.out.println("sum = "+sum);
    }
}
