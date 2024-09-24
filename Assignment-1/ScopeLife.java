public class ScopeLife{

	int data = 100;

	int a, b;				// intstance or non-static variable
	static int result;		// class or static variable

	public int sum(int x, int y){	// Local variable
		return x+y;
	}

	public void add(int data){
		data += 50;
		System.out.println(data);
	}
	public static void main(String[] args){

		ScopeLife sl = new ScopeLife();
		result = sl.sum(11,22);				// no need obj to call static variable
		System.out.println(result);
		// System.out.println(a+"  "+b);	// non static fields can't access from static context
		System.out.println("Instance Variable : "+sl.a+"  "+sl.b);
		
		System.out.println(sl.data);
		sl.add(20);

	}
}