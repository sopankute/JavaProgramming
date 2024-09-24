package pack_three;
import pack_one.ClassOne;
import pack_two.ClassTwo;

public class ClassThree{
	public static void main(String[] args){
		ClassOne c1 = new ClassOne();
		ClassTwo c2 = new ClassTwo();
		c1.meth1();
		c2.meth();
	}
}