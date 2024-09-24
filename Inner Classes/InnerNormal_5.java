class InnerNormal_5{

	int x = 11;
	class Inner{

		int x = 22;
		public void meth(){

			int x = 33;
			System.out.println(x);						// 33 - directly accessed
			System.out.println(this.x);					// 22 - need current obj refence
			System.out.println(InnerNormal_5.this.x);	// 11 - need outer obj 

			// System.out.println(o.this.x);	// error
		}
	}

	public static void main(String[] args) {
		
		new InnerNormal_5().new Inner().meth();

		// InnerNormal_5 o = new InnerNormal_5();
		// InnerNormal_5.Inner i = o.new Inner();
		// i.meth();
	}
}