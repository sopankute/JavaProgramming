class HeapDemo {
	public static void main(String[] args) {
		long mb = 1024*1024;					// 1 mb = 1024*1024 bytes
		Runtime r = Runtime.getRuntime();
		System.out.println("Max Memory: "+r.maxMemory()/mb+" mb");
		System.out.println("Total Memory: "+r.totalMemory()/mb+" mb");
		System.out.println("Free Memory: "+r.freeMemory()/mb+" mb");
		System.out.println("Consumed memory:"+(r.totalMemory()-r.freeMemory())/mb+" mb");
	}
}

// OUTPUT : 
// C:\Users\Admin\Desktop\Java Programming\DurgaSoft>javac HeapDemo.java

// C:\Users\Admin\Desktop\Java Programming\DurgaSoft>java HeapDemo
// Max Memory: 1990 mb
// Total Memory: 126 mb
// Free Memory: 124 mb
// Consumed memory:1 mb

// C:\Users\Admin\Desktop\Java Programming\DurgaSoft>java -Xmx512m HeapDemo
// Max Memory: 512 mb
// Total Memory: 126 mb
// Free Memory: 124 mb
// Consumed memory:1 mb

// C:\Users\Admin\Desktop\Java Programming\DurgaSoft>java -Xms64m HeapDemo
// Max Memory: 1990 mb
// Total Memory: 64 mb
// Free Memory: 62 mb
// Consumed memory:1 mb