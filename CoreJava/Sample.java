package pune;

public class Sample{
	public void msg(){
		System.out.println("Hello, I'm from Pune.");
	}
	public static void main(String[] args){
		Sample s = new Sample();
		s.msg();

	}
}

// 		javac -d . Sample.java
// 		java pune.Sample
// 		output : Hello, I'm from Pune.