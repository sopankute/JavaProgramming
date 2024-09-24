public class DisplayAlpha{

	public synchronized void printNos(){
		for(int i=1; i<=26; i++){
			System.out.print(i+"  ");
			try{Thread.sleep(300);
			}catch(Exception e){}
		}
		System.out.println();
	}
	public synchronized void printAlphaC(){
		for(int i=65; i<=90; i++){
			System.out.print((char)i+"  ");
		}
		System.out.println();
	}
	public synchronized void printAlphaS(){
		for(int i=97; i<=122; i++){
			System.out.print((char)i+"  ");
		}
		System.out.println();
	}
	
}