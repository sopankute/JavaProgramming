public class ElseIf {
    public static void main(String[] args) {
        int m1= Integer.parseInt(args[0]);
        int m2= Integer.parseInt(args[1]);
        int m3= Integer.parseInt(args[2]);

        int percent = ((m1+m2+m3)/3);
        System.out.println("Percentage: "+percent);

        if(percent > 70)
            System.out.println("Distinction");
        else if(percent >= 60)
            System.out.println("First");
        else if(percent >= 50)
            System.out.println("Second");
        else if(percent >=40)
            System.out.println("Third");
        else
            System.out.println("Failed");

    }
}