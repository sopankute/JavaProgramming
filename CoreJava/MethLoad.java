public class MethLoad{
	int a, b, c;
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	void sum(int a, double b)
	{
		System.out.println(a+b+c);
	}

	void sum(double a, double b, double c)
	{
		System.out.println(a+b+c);
	}
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args){
		MethLoad ml = new MethLoad();
		ml.sum(10, 20);
		ml.sum(10, 30);

		ml.sum(10, 20, 30);
		ml.sum(40, 50, 30);
	}
}