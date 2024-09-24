public class NumberTable{
	public synchronized void PrintNumberTable(int n){
		for(int i=1; i<=10; i++){
			System.out.println(n+" * "+i+"  ="+(n*i));
			try{
				Thread.sleep(300);
			}catch(Exception e){}
		}
	}
}