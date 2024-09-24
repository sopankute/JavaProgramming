package two;

public class Inheritance extends Constructor {
	Inheritance(){
//		this(10);
		System.out.println("From child class");
	}
	Inheritance(int a){
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		i.con();
		System.out.println("var : "+i.a);
		System.out.println("=======Inheritance class========");
		Inheritance.test();	//Constructor.test();
		i.test2();
		System.out.println(i);
	}
	private void test2() {
		System.out.println(a);//a - is non static
		System.out.println(this);
		System.out.println(b); //Constructor.b
	}
}
