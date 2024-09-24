
public class PrintTableDemo{   
    public static void main(String[] args) {
        Table t=new Table();
        //first thread
        new Thread(){
            public void run(){
                t.printTable(19);
            }
        }.start();
        //second thread
        new Thread(){
            public void run(){
                t.printTable(17);
            }
        }.start();
         // third thread
         new Thread(){
            public void run(){
                t.printTable(14);
            }
        }.start();
    }
}
