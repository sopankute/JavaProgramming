class Factorial {

	void fact(int n) {
		Long f = 1L;
		for(int i = 1; i <= n; i++)
			f=f*i;

		System.out.println(f);

		System.out.println(this);

	}

	public static void main(String[] args) {
		
		Factorial f1 = new Factorial(); //Anonymous object
		f1.fact(19);

		System.out.println(f1); // object reference
	}
}