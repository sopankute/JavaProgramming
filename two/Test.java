package two;

public class Test {
	static int b = 30;
	int a = 10;
	//SIB -> MAIN -> IIB -> CONSTRUCTOR
	//SIB -> IIB -> CONSTRUCTOR -> MAIN -> IIB -> CONSTRUCTOR 
	//SIB -> IIB -> IIB => recursion
	
	{//IIB - instance initialization block
		a = 20;
		b = 40;
		System.out.println("from non static");
	}
	
	{
		//new Test();
		a = 20;
		b = 40;
		System.out.println("from non static 1");
	}
	static {// SIB - static initialization block
		b = 70;
		System.out.println("from static 3");
		new Test();
	}
	static {
		b = 70;
		System.out.println("from static");
	}
	
	Test(){
		System.out.println("From Constructor");
	}
	//
	public static void main(String[] args) {
		Test t = new Test();
	}
	static {
		b = 70;
		System.out.println("from static 2");
	}
}
