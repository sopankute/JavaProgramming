
package mypkg;

import exceptionpkg.*;

public class Customer_2{
     int balance ;
     
    Customer_2(int balance){
        
        this.balance=balance;
    }

    void withdraw(int amount)throws InsufficientAmount{
        
        if (amount>balance)
            throw new InsufficientBalance("sorry, your Balance Low... ");
        else
            balance -= amount;
    }

    void show(){
         System.out.println("account balance is  "+balance);
    }


 public static void main(String[] args) {
          Customer_2 c1=new Customer_2(123451);
          try {
          c1.withdraw(10000);
          c1.disp();
          c1.withdraw(15000);
          c1.disp();
          }
          catch(Exception e){
              System.out.println(e);
          }
          System.out.println("Exception is handaled.... ");  
 }
}