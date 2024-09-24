public class GCDemo {

	public void finalize() { //usually contains clean up code
		System.out.println("GC invoked!");
	}

	public static void main(String[] args) {
		GCDemo[] gc = new GCDemo[5];
		for(int i = 0; i < gc.length; i++) {
			gc[i] = new GCDemo(); //10 objects
		}

		gc = null;
		System.gc(); //invoke garbage collector. May or may not come
	}
}