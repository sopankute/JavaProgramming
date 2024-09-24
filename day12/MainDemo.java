public class MainDemo {

/*
strictfp public static void main(String[] args){}

warning: [strictfp] as of release 17, 
all floating-point expressions are evaluated strictly and
 'strictfp' is not required

 ^ can be ignored if using version >= 17
*/

/* here we are overloading add() every time there is a 
	new variation in number of arguments passed

	//[A]
	static void add(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}
	
	//[B]
	static void add(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}

	//[C]
	static void add(int x, int y, int z, int a, int b) {
		int sum = x + y + z + a + b;
		System.out.println(sum);
	}
*/

	//[D]
	//using varargs, here we are eliminating overloading add()
	//multiple times by taking variable argmunents
	static void add(int... arr) { //implicitly becomes an array
		int sum = 0;

		for(int i : arr) //for-each
			sum += i;

		System.out.println(sum);
	}

	synchronized final public static void main(String... args) {

		add(123, 321); //A, now uses D after commenting
		add(123, 321, 456); //B, now uses D after commenting
		add(12, 34, 56, 78, 89); //C, now uses D after commenting

		add(1, 2, 3, 4, 5, 6, 7); //D
		add(1, 2, 3, 4, 5, 6, 7, 77, 88, 99, 100); //D
	}
}

/*
 ...  <-var args: receive variable number of arguments

*/