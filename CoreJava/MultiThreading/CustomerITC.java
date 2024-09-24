
public class CustomerITC{
double bal;
    public CustomerITC(double bal) {
        this.bal = bal;
    }
    public double getBal() {
        return bal;
    }
    synchronized public void withdraw(int amt){
        System.out.println("Going to withdraw!");
        if(amt>bal){
            System.out.println("Less Balance");
            try{
            wait(); // releases lock
            }catch(Exception e){}
        }
        bal=bal-amt;
        System.out.println("Withdraw succesful!");
    }
    
    synchronized public void deposit(int amt){
        System.out.println("Going to Deposit");
        bal=bal+amt;
        System.out.println("Deposited!");
        notify(); // relases lock
    }
    
    public static void main(String[] args) {
        CustomerITC c1=new CustomerITC(25000);
        
        new Thread(){
            public void run(){
                c1.withdraw(30000);
            }
        }.start();
        
        new Thread(){
            public void run(){
                c1.deposit(10000);
            }
        }.start();
         
         try{
             Thread.sleep(1500);
         }catch(Exception e){}
         
        System.out.println(c1.getBal());
    }
}