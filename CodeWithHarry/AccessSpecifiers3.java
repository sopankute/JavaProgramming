package in;

class Base{
	public int a = 11;
	protected int b = 22;
	int c = 33;
	private int d = 44;

	public void meth1(){
		System.out.println("Through Method....Base class");
		System.out.println("Public : "+a);
		System.out.println("Protected : "+b);
		System.out.println("Default : "+c);
		System.out.println("Private : "+d+"\n");	
	}
}
public class AccessSpecifiers3{
	public static void main(String[] args){
		Base b = new Base();
		System.out.println("All types Specifiers variable accessed in 'outside Class'");
		b.meth1();

		System.out.println("Same Package Non-Subclass....");
		System.out.println("Public : "+b.a);
		System.out.println("Protected : "+b.b);
		System.out.println("Default : "+b.c);
		// System.out.println("Private : "+b.d);	// Also Can't Access coz Private
	}
}

/*
output :
				All types Specifiers variable accessed in 'Non Sub-Class'
				Through Method....Base class
				Public : 11
				Protected : 22
				Default : 33
				Private : 44

				Non-Subclass....
				Public : 11
				Protected : 22
				Default : 33
*/