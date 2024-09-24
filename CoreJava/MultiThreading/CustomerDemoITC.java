
public class CustomerDemoITC{
	double bal;
	public CustomerDemoITC(double bal){
		this.bal = bal;
	}
	public double getBal(){
		return bal;
	}
	public synchronized void withdraw(int amt){
		System.out.println("Going to withdraw...");
		if(amt > bal){
			System.out.println("Balance is not enough to withdraw !");
			try{
				wait();
			}catch(Exception e){}
		}
		bal -= amt;
		System.out.println("withdraw Successfully !!");
	}
	public synchronized void deposit(int amt){
		System.out.println("Going to Deposit");
		bal += amt;
		System.out.println("Deposit Successfully !!");
		notify();
	}
	public static void main(String[] args){
		CustomerDemoITC c1 = new CustomerDemoITC(2000);

		new Thread(){
			public void run(){
				c1.withdraw(2500);
			}
		}.start();


		new Thread(){
			public void run(){
				c1.deposit(1500);
			}
		}.start();

		 try{
             Thread.sleep(1500);
         }catch(Exception e){}
         
        System.out.println(c1.getBal());
	}
}