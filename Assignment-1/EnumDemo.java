enum Day{
	MON,TUES,WED,THRUS,FRI,SAT,SUN;
}

public class EnumDemo{
	public static void main(String[] args) {
		Day[] d= Day.values(); 		// values-- explicility in an array

		for(Day d1:d)
			System.out.println(d1);
	}
}