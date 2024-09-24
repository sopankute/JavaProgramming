
// Interface inside of class

public class InterfaceInClass{

	public static interface Vehicle{	// whether declared or not
		public int getNoOfWheels();
	}

    class Bus implements Vehicle{
		public int getNoOfWheels(){
			return 6;
		}
    }

    class Car implements Vehicle{
		public int getNoOfWheels(){
			return 4;
		}
    }
	public static void main(String[] args) {
		InterfaceInClass v = new InterfaceInClass();
		InterfaceInClass.Bus b = v.new Bus();
		System.out.println(b.getNoOfWheels());	// 6

		InterfaceInClass.Car c = v.new Car();
		System.out.println(c.getNoOfWheels());	// 4
	}
}