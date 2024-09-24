public class Display {
	
	public synchronized void dispNos() {
		for(int i = 1; i <= 26; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {}
		}
		System.out.println();
	}

	public synchronized void dispAlphaC() {
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {}
		}
		System.out.println();
	}	

	public synchronized void dispAlphaS() {
		for(int i = 97; i <= 122; i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {}
		}
		System.out.println();
	}	
}