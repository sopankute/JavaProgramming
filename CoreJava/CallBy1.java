public class CallBy1{
	
	int num = 15;	// instance variable

	void change(int num){
		num += 10;
	}
	public static void main(String[] args){

		CallBy1 c = new CallBy1();

		System.out.println(c.num);		// 15
		c.change(20);
		System.out.println(c.num);		// 15 - original value doesn't change
	}
}