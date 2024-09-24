package cdac.hyd;
//classes, methods must be public if we want them to be accessed
//from another package
public class DASSD {
	int strength = 28;
	public void getTotal() {
		System.out.println("PG DASSD = strength: "+strength);
	}

	public static void main(String[] args) {
		DASSD d1 = new DASSD();
		d1.getTotal();
	}
}

/*
compilation command:
javac -d . DASSD.java

run command:
java cdac.hyd.DASSD
*/