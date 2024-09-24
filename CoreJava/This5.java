public class This5{

	void proveThis(){
		System.out.println(this);	// This5@4617c264
	}
	public static void main(String[] args){
		This5 t5 = new This5();
		System.out.println(t5);

		t5.proveThis();				// This5@4617c264


	}
}