
public class AnonymousDemo1{
	public static void main(String[] args){
		NumberTable1 t = new NumberTable1();
		new Thread(){
			public void run(){
				t.PrintNumberTable(17);
				t.PrintNumberTable(13);
			}
		}.start();
		new Thread(){
			public void run(){
				t.PrintNumberTable(18);
			}
		}.start();
		new Thread(){
			public void run(){
				t.PrintNumberTable(19);
			}
		}.start();

	}
}