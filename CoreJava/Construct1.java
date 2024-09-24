public class Construct1{
	int roll_no;
	String name;
	int age;
	public Construct1(int r, String n, int a){
		roll_no = r;
		name = n;
		age = a;
	}
	public Construct1(Construct1 c){
		roll_no = c.roll_no;
		name = c.name;
		age = c.age;
	}
	public void disp(){
	System.out.println(roll_no+"\t"+name+"\t"+age);
	}
	public static void main(String[] args){
	Construct1 c1 = new Construct1(9876,"Sopan Kute",24);
	Construct1 c2 = new Construct1(c1);

	c1.disp();
	c2.disp();
	}
}