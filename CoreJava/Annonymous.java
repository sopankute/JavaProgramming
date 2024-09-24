public class Annonymous{
	public void fact(int n){
		int fact = 1;
		for(int i=1; i<=n; i++){
			fact *=i;
		}
		System.out.println(fact);
	}
	public static void main(String [] args){
		
	new Annonymous().fact(5);					// Annonymous Object

	}
}