public class NumberTable1{
	public void PrintNumberTable(int n){
		synchronized(this){				// synchronized block
			for(int i=1; i<=10; i++){
				System.out.println(n+" * "+i+"  ="+(n*i));
				try{
					Thread.sleep(300);
				}catch(Exception e){}
			}
		}


	}
}