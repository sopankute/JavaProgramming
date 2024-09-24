public class CallBy2{
	
	int num = 20;

	void change(CallBy2 cb){
		cb.num += 15; 
	}
	public static void main(String[] args){
		CallBy2 cb = new CallBy2();

		System.out.println(cb.num);		// 20
		cb.change(cb);
		System.out.println(cb.num);		// 35 - get change after passing obj instance of class
	}
}