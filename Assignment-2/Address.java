// Question 27

public class Address{
	int house_no;
    String locality;
    String city;
    String state;
    String country;
    int pinCode;
    	public Address(int h_no, String loc, String ct, String st, String cnt, int pin){
    		this.house_no = h_no;
    		this.locality = loc;
    		this.city = ct;
    		this.state = st;
    		this.country = cnt;
    		this.pinCode = pin;
    	}
    	public void showAdd(){
		    System.out.print("Address : \t");
		    System.out.println(house_no+", "+locality+", "+city+", "+state+", "+country+"-"+pinCode);
    	}
}