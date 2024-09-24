
public class CTDemo extends Thread{
    void even(){
        for(int i=0; i<=10; i+=2)
            System.out.println("EVEN : "+i);
    }
    void odd(){
        for(int i=1; i<=10; i+=2)
            System.out.println("ODD  : "+i);
    }
    public void run(){
        if(Thread.currentThread().getName().equals("Even"))
            even();
        else
            odd();
    }
   public static void main(String[] args){
        CTDemo t1 = new CTDemo();
        CTDemo t2 = new CTDemo();

        t1.setName("Even");
        t2.setName("Odd");
        t1.start();
        t2.start();
    }
}