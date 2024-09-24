enum Day {
	MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class EnumDemo {
	public static void main(String[] args) {
		
		//similar to creating an object
		Day[] d = Day.values(); //store all values in an array

		for(Day d1 : d)
			System.out.println(d1);

		System.out.println("\n1st day of a week: "+Day.MON);
	}
}

//-> two .class are generated: EnumDemo.class & Day.class
//-> public modifier is used with enum, when declared in a separate file
//-> enum can be replaced with a simple String array also