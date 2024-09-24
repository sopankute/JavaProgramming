import java.io.*;
import java.util.*;

// Static keyword

public class StaticDemo{
	static int count;

	public StaticDemo()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[]args){
		StaticDemo d1 = new StaticDemo();
		StaticDemo d2 = new StaticDemo();
		StaticDemo d3 = new StaticDemo();

		// output: 1 1 1  for (int count)
		// output: 1 2 3  for (static int count)
	}
}