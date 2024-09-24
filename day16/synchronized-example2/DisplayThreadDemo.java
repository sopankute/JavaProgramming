public class DisplayThreadDemo {
	public static void main(String[] args) {
		Display d = new Display();
		
		//first thread
		new Thread() {
			public void run() {
				d.dispNos();
			}
		}.start();

		//second thread
		new Thread() {
			public void run() {
				d.dispAlphaC();
			}
		}.start();

		//third thread
		new Thread() {
			public void run() {
				d.dispAlphaS();
			}
		}.start();
	}
}