

public class PrintTableDemo1{
    public static void main(String[] args) {
        Table t=new Table();
        T1 t1=new T1(t); // thread 1
        T2 t2=new T2(t); // thread 2
        T3 t3=new T3(t);
         t1.start();
         t2.start();
         t3.start();
    }
}
class T1 extends Thread{
    Table t;
    public T1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(19);
    }
}
class T2 extends Thread{
    Table t;
    public T2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(17);
    }
}
class T3 extends Thread{
    Table t;
    public T3(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(14);
    }
}
