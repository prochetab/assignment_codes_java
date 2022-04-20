package i_assess_java_1_packaging;

public class Address {
public String street;
public String city;
public int pincode;
public String country;
public Address(String street, String city, int pincode, String country)
{
	this.street=street;
	this.city=city;
	this.pincode=pincode;
	this.country=country;
}
public void displayAddress()
{
	System.out.println("Street: "+street);
	System.out.println("City: "+city);
	System.out.println("Pincode: "+pincode);
	System.out.println("Country: "+country);
}
}
