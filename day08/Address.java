public class Address {
	String houseNo;
	String streetName;
	String locality;
	String city;
	String state;
	String country;
	int pinCode;

	public Address(String houseNo, String streetName, String locality, String city, String state, String country, int pinCode) {
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public void dispAddress() {
		System.out.println("\n*********Address*********");
		System.out.println(houseNo+"\t"+streetName);
		System.out.println(locality+"\t"+city);
		System.out.println(state+"\t"+country+"\t"+pinCode);
	}
}