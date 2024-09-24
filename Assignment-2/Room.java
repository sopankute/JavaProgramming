import java.io.*;
import java.util.*;

// Question 17

class Room{
	int room_no;
	String room_type;
	double room_area;
	boolean acMachine;
	public void setData(int r_no, String r_typ, double r_area, boolean ac){
		room_no = r_no;
		room_type = r_typ;
		room_area = r_area;
		acMachine  = ac;
	}
	public void dispData(){
		System.out.println("The Room No :   "+room_no+"\nThe Type of Room : "+room_type+"\nArea of Room :  "+room_area+" sq.Feet");
		if(acMachine)
			System.out.println("Ac Machine :\t Yes!\n");
		else
			System.out.println("Ac Machine :\t No!\n");		
	}
	public static void main(String[] args){
		Room r1 = new Room();
		r1.setData(103,"Standard", 200, false);
		r1.dispData();

		Room r2 = new Room();
		r2.setData(105,"Superior", 350, true);
		r2.dispData();

	}
}
/*
OUTPUT :
					The Room No :   103
					The Type of Room : Standard
					Area of Room :  200.0 sq.Feet
					Ac Machine :     No!

					The Room No :   105
					The Type of Room : Superior
					Area of Room :  350.0 sq.Feet
					Ac Machine :     Yes!
*/