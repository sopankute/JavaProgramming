
// Class inside of Interface
interface Vehicle{
	public int getNoOfWheels();

	class Auto implements Vehicle{		// can be static or public
		public int getNoOfWheels(){
			return 3;
		}
	}
}
class Bus implements Vehicle{
		public int getNoOfWheels(){
			return 6;
		}
	}
public class ClassInInterface{
	public static void main(String[] args) {

		Vehicle.Auto a = new Vehicle.Auto();
		System.out.println(a.getNoOfWheels());

		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
	}
}