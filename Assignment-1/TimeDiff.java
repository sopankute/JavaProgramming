import java.util.Scanner;

// Question 16 and 17
public class TimeDiff{
   int hr;
   int min;
   int sec;
   void time() {
      Scanner sc = new Scanner(System.in);
      boolean result = false;
      while (!result){ //Enter the time until user enter correct input
         System.out.println("Enter time in hour : minute : second.");
         hr = sc.nextInt();
         min = sc.nextInt();
         sec = sc.nextInt();
         if (hr <= 12 && min < 60 && sec < 60){
            result = true;
         }
         else {
            System.out.println("Invalid input.");
         }
      }
   }
   void differ_time(TimeDiff t1 , TimeDiff t2) {
      System.out.println("The Time difference : ");
      System.out.printf(Math.abs(t1.hr - t2.hr) + " " + Math.abs(t1.min - t1.min) + " " + Math.abs(t1.sec - t2.sec));
   }
   public static void main(String[] args) {

      TimeDiff t = new TimeDiff();
      System.out.println("Your starting time");
      t.time();
      TimeDiff t1 = new TimeDiff();
      System.out.println();
      System.out.println("Your ending time");
      t1.time();
      System.out.println();
      System.out.println("Your starting time:");
      System.out.println(t.hr + " " + t.sec + " " + t.min);
      System.out.println("Your ending time:");
      System.out.println(t1.hr + " " + t1.sec + " " + t1.min);
      t.differ_time(t , t1);
   }
}

/*
 OUTPUT :
                        Your starting time
                        Enter time in hour : minute : second.
                        01 23 34

                        Your ending time
                        Enter time in hour : minute : second.
                        08 43 21

                        Your starting time:
                        1 34 23
                        Your ending time:
                        8 21 43
                        The Time difference :
                        7 0 13
*/