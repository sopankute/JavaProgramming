
// Nested Inner Class
class InnerNormal_6{
	
	class Inner1{

		class Inner2{
			public void meth(){
				System.out.println("Inner2 most class meth() method");
			}
		}
	}
	public static void main(String[] args) {
		InnerNormal_6 a = new InnerNormal_6();
		InnerNormal_6.Inner1 b = a.new Inner1();
		InnerNormal_6.Inner1.Inner2 c = b.new Inner2();
		c.meth(); 
	}
}
