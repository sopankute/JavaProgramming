class Table1 extends Thread{
	NumberTable nt;
		public Table1(NumberTable nt){
			this.nt = nt;
		}
		public void run(){
			nt.PrintNumberTable(17);
		} 
}
class Table2 extends Thread{
	NumberTable nt;
		public Table2(NumberTable nt){
			this.nt = nt;
		}
		public void run(){
			nt.PrintNumberTable(18);
		}
}
class Table3 extends Thread{
	NumberTable nt;
		public Table3(NumberTable nt){
			this.nt = nt;
		}
		public void run(){
			nt.PrintNumberTable(19);
		}
	
}

public class TableDemo{
	public static void main(String[] args){
		NumberTable t = new NumberTable();
		Table1 t1 = new Table1(t);
		Table2 t2 = new Table2(t);
		Table3 t3 = new Table3(t);

		// t1.setPriority(10);
		// t2.setPriority(5);
		// t3.setPriority(1);
		t1.start();
		t3.start();
		t2.start();
	}
}