public class Address_3{
    String hno;
    String streetName;
    String locality;
    String city;
    String state;
    String country;
    int pinCode;
public Address(String hno, String streetName, String locality, String city, String state, String country, int pinCode){
    this.hno=hno;
    this.streetName=streetName;
    this.locality=locality;
    this.city=city;
    this.state=state;
    this.country=country;
    this.pinCode=pinCode;        
}
public void dispAddress(){
    System.out.println("********Address********");
    System.out.println(hno+"\t"+streetName);
    System.out.println(locality+"\t"+city);
    System.out.println(state+"\t"+country+"\t"+pinCode);
}
}