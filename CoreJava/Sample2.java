package pune.warje;

public class Sample2{
	public void method(){
		System.out.println("hello, I'm in SubPackge.");
	}
	public static void main(String[] args){
		Sample2 s1 = new Sample2();
		s1.method();
	}
}
// 			javac -d . Sample2.java
// 			java pune.warje.Sample2
// 			output : hello, I'm in SubPackge.s