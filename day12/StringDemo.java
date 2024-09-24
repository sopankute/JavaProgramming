public class StringDemo {
	public static void main(String[] args) {
		
		String s = "Sachin";
		s.concat(" Tendulkar");
		System.out.println(s); 
		// "Sachin" because strings are immutable
		// "Sachin Tendulkar" also exists in SCP but no
		// reference variable refers to it :(

		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Java");
		System.out.println(sb); 
		//"Hello Java" because StringBuilder is mutable

		String str = "Hello"+" Java"; // Hello Java
		System.out.println(str);

//-------what actually is happening on line 16---------
		String s1 = new StringBuffer().append("hello").append(" Java").toString();
		//keeps calling .append() methods
		//and when all strings are done(i.e appended)
		//.toString() is called at the very end
		System.out.println(s1);

		//similar to line 20, but not thread-safe
		String s2 = new StringBuilder().append("hello").append(" Java").toString();
		System.out.println(s2);
//-----------------------------------------------------

		String s3 = 50+30+"Sachin"+40+60; // 80Sachin4060
		/*
		a) 50 + 30 (arithematic coz operands are numbers) = 80
		b) 80 + "Sachin" (when at least one operand is String, then concatenation) = 80Sachin
		c) "80Sachin" + 40 = 80Sachin40
		d) "80Sachin40" + 60 = 80Sachin4060
		*/
		System.out.println(s3);
	}
}