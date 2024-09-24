package in;

public class AccessSpecifiers1{
	public int a = 11;
	protected int b = 22;
	int c = 33;
	private int d = 44;

	public void meth1(){
		System.out.println("Public : "+a);
		System.out.println("Protected : "+b);
		System.out.println("Default : "+c);
		System.out.println("Private : "+d+"\n");
	}
	public static void main(String[] args){
		AccessSpecifiers1 sp = new AccessSpecifiers1();
		System.out.println("All types Specifiers variable accessed in 'Same Class'");
		sp.meth1();

		System.out.println("Public : "+sp.a);
		System.out.println("Protected : "+sp.b);
		System.out.println("Default : "+sp.c);
		System.out.println("Private : "+sp.d);
	}
}
/*
output 1 : 
		All types Specifiers variable accessed in 'Same Class'
		Public : 11
		Protected : 22
		Default : 33
		Private : 44

		Public : 11
		Protected : 22
		Default : 33
		Private : 44

*/