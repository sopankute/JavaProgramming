package mypack;

//import cdac.hyd.*; // all classes - PGDAC and DASSD
import cdac.hyd.PGDAC; // only PGDAC.class is imported
import in.cdachyd.*;

public class TestPack {
	public static void main(String[] args) {
		
		PGDAC d1 = new PGDAC();
		d1.getTotal();

		cdac.hyd.DASSD d2 = new cdac.hyd.DASSD(); //FQN
		d2.getTotal();

		Date2 d = new Date2();
		d.getDate();
	}
}

//in order to access an user defined package(here, cdac.hyd), 
//one must be in a package (here, mypack).
//we can either use import keword or FQN

/*
compilation command:
javac -d . TestPack.java

run command:
java mypack.TestPack
*/