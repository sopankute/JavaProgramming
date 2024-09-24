
public class Table{
    
    public synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+"  ="+(n*i));// 19*1 =19
            try{
                Thread.sleep(600);
            }
            catch(Exception e){}
        }
    }
}
