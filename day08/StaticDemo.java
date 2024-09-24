public class StaticDemo {
	int count; //0, instance variable, does not retain value: 1 1 1
	static int count2; // static variable, retains its value: 1 2 3

	public StaticDemo() {
		count++;
		count2++;
		System.out.println(count+" "+count2);
	}

	public static void main(String[] args) {
		
		StaticDemo d1 = new StaticDemo();
		StaticDemo d2 = new StaticDemo();
		StaticDemo d3 = new StaticDemo();

	}
}