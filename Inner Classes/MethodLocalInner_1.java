public class MethodLocalInner_1{
	
	public void meth(){

			class Inner{
				public void add(int i, int j){
					System.out.println("Sum : "+(i+j));
				}
			}
			
		Inner i = new Inner();
		i.add(12, 23);
		i.add(34, 45);
		i.add(56, 67);
	}

	public static void main(String[] args) {
		new MethodLocalInner_1().meth();
	}
}