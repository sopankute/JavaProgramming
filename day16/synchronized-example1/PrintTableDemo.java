//using anonymous inner class
public class PrintTableDemo {
	public static void main(String[] args) {
		Table t = new Table();
		
		//first thread
		new Thread() {
			public void run() {
				t.printTable(19);
			}
		}.start();

		//second thread
		new Thread () {
			public void run() {
				t.printTable(17);
			}
		}.start();

		//third thread
		new Thread() {
			public void run() {
				t.printTable(14);
			}
		}.start();
	}
}


/*public class PrintTableDemo {
	public static void main(String[] args) {
		Table t = new Table();
		T1 t1 = new T1(t); // thread 1
		T2 t2 = new T2(t); // thread 2
		T3 t3 = new T3(t); // thread 3

		t1.start();
		t2.start();
		t3.start();
	}
}

class T1 extends Thread { //me
	Table t; //Table instance //making a bookmyshow instance
	public T1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(19); //booking my ticket
	}
}

class T2 extends Thread { //you
	Table t; //Table instance //making a bookmyshow instance
	public T2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(17); //booking your ticket
	}
}

class T3 extends Thread {
	Table t; //Table instance
	public T3(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(14);
	}
}
*/
