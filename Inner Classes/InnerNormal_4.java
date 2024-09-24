class InnerNormal_4{
	int x = 10;
	static int y = 20;
	private int z = 30;

	class Inner{

		public void meth(){
			// can access static, non-static, private and non-private variables directly
			System.out.println(x);	// 10
			System.out.println(y);	// 20
			System.out.println(z);	// 30
		}
	}
	public static void main(String[] args) {
		InnerNormal_4 o = new InnerNormal_4();
		InnerNormal_4.Inner i = o.new Inner();
		i.meth();
	}
}