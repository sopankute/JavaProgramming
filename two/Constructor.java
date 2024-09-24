package two;

public class Constructor {
	//Constructor is a special type of method 
	//having same name as of class
	//which is used initialize the object.
	int a=20;
	static int b; 
	Constructor(){
		//this(10);
		System.out.println("From parent class");
		a=40;
	}
	Constructor(char a){
		//this('a',10);
		a=30;
		b=30;
	}
	Constructor(int a){
		//this('a',10);
		a=30;
		b=30;
	}
	Constructor(char b,int c){
		System.out.println(b);
	}
	Constructor(int c,char b){
		System.out.println(c);
	}
	//constructor chaining
	//calling one constructor of one class from same or another class
	//using another constructor
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c2 = new Constructor();
		System.out.println(c.a);
		System.out.println(c.b); //Constructor.b
		c.a=c.a + c.a;
		c.b = c.b + c.b;
		System.out.println(c2.a);
		System.out.println(c2.b);
		c.a = 50;
		c2.a = 100; 
		c.con();
		cont();
		System.out.println(c2);
	}
	public void con() {
		System.out.println("a : "+this.a);
		System.out.println("b : "+this.b); //c.b => Constructor.b
		this.cont();
//		System.out.println(this);
//		System.out.println(a);	//this.a
//		System.out.println(b);	//class_name.var_name
	}
	public static void cont() {
		System.out.println();
	}
	public static void test() {
		System.out.println("From Test");
	}
}
