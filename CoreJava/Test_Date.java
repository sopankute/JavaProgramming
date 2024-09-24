import java.io.*;
import java.util.*;		// Implicit import
import java.sql.*;

public class Test_Date{

	public static void main(String[] args){
		Date d = new Date();				// Ambiguos Error
		System.out.println(d);
	}
}

// Test_Date.java:8: error: reference to Date is ambiguous
		// Date d = new Date();