public class Construct{
	int roll_no;
	String name;
	int age;
	public Construct(int r, String n){
		roll_no = r;
		name = n;
	}
	public Construct(int r, String n, int age){
		roll_no = r;
		name = n;
		this.age = age;
	
	}
	public void disp(){
	System.out.println(roll_no+"\t"+name+"\t"+age);
	}
	public static void main(String[] args){
		Construct c1 = new Construct(1123,"Sopan");
		Construct c2 = new Construct(1123,"Sopan",24);

		c1.disp();
		c2.disp();
	}
}