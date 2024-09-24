
public class Table {
//making method synchronized
	public synchronized void printTable(int num) { //prints table of num
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+" * "+i+" = "+(num * i));
			try {
				Thread.sleep(600);
			}
			catch(Exception e) {}
		}
	}
}