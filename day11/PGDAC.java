package cdac.hyd;
//classes, methods must be public if we want them to be accessed
//from another package
public class PGDAC {
	int strength = 140;
	public void getTotal() {
		System.out.println("PG DAC = strength: "+strength);
	}

	public static void main(String[] args) {
		PGDAC d1 = new PGDAC();
		d1.getTotal();
	}
}
/*
compilation command:
javac -d . PGDAC.java

-d <- tells the compiler to keep the .class files in the /cdac/hyd/
.  <- create the package in current folder
Note: instead of '.', give desktop path to save the package there

run command:
java cdac.hyd.PGDAC
*/