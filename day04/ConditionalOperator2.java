//Largest & smallest of three numbers
public class ConditionalOperator2 {
    public static void main(String[] args) {

        int a = (int) (Math.random() * 100); //0 - 99
        int b = (int) (Math.random() * 100); //0 - 99
        int c = (int) (Math.random() * 100); //0 - 99

        System.out.println("Numbers generated are: "+a +" " +b+ " "+c);

        int largest = (a > b && a > c) ? a : ((b > c) ? b : c); //nested
        int smallest = (a < b && a < c) ? a : ((b < c) ? b : c); //nested

        System.out.println("Largest is "+largest);
        System.out.println("smallest is "+smallest);       
    }
}
