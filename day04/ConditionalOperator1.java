//Largest & smallest of two numbers
public class ConditionalOperator1 {
    public static void main(String[] args) {
     
        int a = (int) (Math.random() * 100); //0 - 99
        int b = (int) (Math.random() * 100); //0 - 99

        System.out.println("Numbers generated are: "+a +" and " +b);

        //using conditional operator to find the largest of a and b
        int largest = (a > b) ? a : b;
        int smallest = (a < b) ? a : b;
        System.out.println("Largest is "+largest);
        System.out.println("Smallest is "+smallest);
     
    }
}
